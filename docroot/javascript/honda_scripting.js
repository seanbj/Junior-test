   

           function toggleBubble(){
			  // jQuery("div.speechBubble").toggle("slow");	
		   }
		   
           jQuery( document ).ready(function() {
        	   
               var current_h = 381;
               var current_w = 227;
	           jQuery('.hondaImage').hover(
	        		   function() {	
	        			   jQuery(this).stop(true, true).animate({
	        		           width: (current_w * 1.05),
	        		           height: (current_h * 1.05)
	        		       }, 300);
	        			   jQuery("div.speechBubble").show("slow");
	        		   }, function() {
	        			   jQuery(this).stop(true, true).animate({
	        		           width: current_w + 'px',
	        		           height: current_h + 'px'
	        		       }, 300);
	        	});
	           
           });