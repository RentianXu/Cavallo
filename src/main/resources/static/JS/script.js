/* =====================================================================
| Template Name: Remoterole
| Website URL : #
| Author Name: #
| Author URL: #
| Description: This is a remote job search portal
| Tags: Remoterole, jobs, remote-jobs, permanent-jobs, part-time-jobs
*  ===================================================================== */

/*
|--------------------------------------------------------------------------------------------------
| Index.html
|-------------------------------------------------------------------------------------------------- 
*/
// Toggle mobile button
function btnToggle(x) {
    x.classList.toggle("change");
    $(document).ready(function () {
      $(".navbar-nav li.nav-item a").click(function(event) {
        $(".navbar-collapse").collapse('hide');
        $(".navbar-toggler").removeClass("change");
      });
    });
}

// ================ AOS-master ================
AOS.init({
  duration: 1100,
  easing: "ease-in-out-back"
});

// ================ Contact us button ================
$(document).ready(function(){
  var c=1;
  $("#contact-us-btn").click(function(){
     c++;
    if(c%2==0)
     $("#contact-us-layer").animate({bottom:"125px"},500);
    else
     $("#contact-us-layer").animate({bottom:"-550px"},500);
  });
});

// ================ Message button ================
$(document).ready(function(){
  var c=1;
  $("#message-btn").click(function(){
     c++;
    if(c%2==0)
     $("#message-box-layer").animate({bottom:"140px"},500);
    else
     $("#message-box-layer").animate({bottom:"-550px"},500);
  });
});