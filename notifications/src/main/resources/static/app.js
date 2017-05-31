var stompClient = null;
var stompClient1 = null;
var subscribeTo = null;
function setConnected(connected) {
	$("#connect").prop("disabled", connected);
	$("#disconnect").prop("disabled", !connected);
	if (connected) {
		$("#conversation").show();
	} else {
		$("#conversation").hide();
	}
	$("#greetings").html("");
}

function connect() {

	var subScibedTo = new SockJS('/announcement/' + subscribeTo);
	stompClient1 = Stomp.over(subScibedTo);
	stompClient1.connect({}, function(frame) {
		setConnected(true);
		console.log('Connected: ' + frame);
		stompClient1.subscribe('/topic/' + subscribeTo, function(greeting) {
			showGreeting(JSON.parse(greeting.body));
		});
	});

	var socket = new SockJS('/announcement/all');
	stompClient = Stomp.over(socket);
	stompClient.connect({}, function(frame) {
		setConnected(true);
		console.log('Connected: ' + frame);
		stompClient.subscribe('/topic/all', function(greeting) {
			showGreeting(JSON.parse(greeting.body));
		});
	});

}

function disconnect() {
	if (stompClient != null) {
		stompClient.disconnect();
	}
	if (stompClient1 != null) {
		stompClient1.disconnect();
	}
	setConnected(false);
	console.log("Disconnected");
}

function sendName() {
	stompClient.send("/announcement/" + $("#department").val(), {}, JSON.stringify({
		'message' : $("#name").val()
	}));
}

function showGreeting(message) {
	$("#greetings").append("<tr><td>" + message.message + "</td></tr>");
}

$(function() {

	$("#publisher").hide();
	$("#subscriber").hide();

	$("form").on('submit', function(e) {
		e.preventDefault();
	});
	$("#connect").click(function() {
		connect();
	});
	$("#disconnect").click(function() {
		disconnect();
	});
	
	$(window).on("unload", function(e) {
		disconnect();
	});
	
	$("#send").click(function() {
		sendName();
	});

	$("#selDepart").change(function() {
		var value = $("#selDepart").find("option:selected").val();
		subscribeTo = 'all';
		$("#publisher").show();
		$("#subscriber").hide();
		if (value != 'publisher') {
			subscribeTo = value;
			$("#publisher").hide();
			$("#subscriber").show();
		}
		$("#department-content").hide();
		connect();

	});
});
