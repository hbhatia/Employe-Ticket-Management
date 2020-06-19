jQuery(document).ready(function($) {

	$('#msg').html("Welcome to Ticket Management");
	var el=document.getElementById ("viewticket");
	if(el){
		el.addEventListener ("click", viewtickets, false);
	}

});

function viewtickets(){
	$.ajax('/viewticket',
    {
        success: function (data, status, xhr) {// success callback function
        	console.log(data);
        	window.location.href="viewTickets?data="+data;
    }});
}

