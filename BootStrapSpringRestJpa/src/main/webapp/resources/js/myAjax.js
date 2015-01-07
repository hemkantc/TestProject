/**
 * 
 */
$(document).ready(function(e) {
	
	$('form').submit(function(event) {
		
		$.ajax({
            type        : 'GET', // define the type of HTTP verb we want to use (POST for our form)
            url         : 'http://localhost:8080/boot/rest/emp/'+$("#eid").val(), // the url where we want to POST
            data        : "", // our data object
            dataType    : 'json', // what type of data do we expect back from the server
            encode          : true
        })
            // using the done promise callback
            .done(function(data) {

                // log data to the console so we can see
                paintit(data); 

                // here we will handle errors and validation messages
            });

        // stop the form from submitting the normal way and refreshing the page
        event.preventDefault();
		
		
		
	});
	
	
});

function paintit(response){
	
	   $('#loadHere').append(
			      '<tr>' +
			        '<td>' + response.id + '</td>' +
			        '<td>' + response.name + '</td>' +
			      '<td>' + response.created + '</td></tr>');
}