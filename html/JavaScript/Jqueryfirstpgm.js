/*
Responsive navigation written by Martin Blackburn.
www.martinblackburn.co.uk

Feel free to use this for your own projects, just be nice and link back here, or my site :)
*/

ResponsiveNav = function(nav, breakPoint) 
{   
    //if no nav container, output an error
    if(typeof nav === "undefined")
    {  
        console.log("The nav container needs setting.");
        return false;
    }
    
    //elements
    var navControl = nav.find(".navControl").first();
    var mainUL = nav.find("ul").first();
    var mainLIs = mainUL.children();
    var extraLI = $("<li class='extraDropdown'><a href='#'>More <span>&#9662;</span></a>");
    var extraDropdown = $("<ul class='dropdown'></ul>");    
    extraLI.append(extraDropdown);
    
  //variables
    var breakPoint = (typeof breakPoint != "number") ? 500 : breakPoint;
  var siteWidth = $(document).width();
  var lastSiteWidth = null;
  var navWidth = mainUL.width();
  var usingExtraDropdown = false;
  
  //listener for screen width
  $(window).resize(function() {
    siteWidth = $(document).width();
    navWidth = mainUL.width();
    checkNavType();
    lastSiteWidth = siteWidth;
  });
  
  //toggle nav when nav control is clicked
  navControl.on('click', function(event) {
      event.preventDefault();
        toggleNav();
    });
  
  //check if to use mobile nav or not
    checkNavType();
    
    //added a extra dropdown if not already there
    function addExtraDropdown()
    {
        if (!usingExtraDropdown) {
            usingExtraDropdown = true;
            mainUL.append(extraLI);
        }
    }
    
    //make sure the LIs fit into the nav
    function checkLIsFit()
    {
        var widthLIs = 0;
        
        mainLIs = mainUL.children();
        
        mainLIs.each(function() {
            widthLIs += $(this).outerWidth(true);
        });
        
        //need a dropdown
        if(widthLIs > navWidth) {
            addExtraDropdown();
            moveLI();
        }
    }
    
    //move LIs to the extra dropdown from main nav
    function moveLI()
    {
        mainLIs = mainUL.children().not(".extraDropdown");
        
        extraDropdown.prepend(mainLIs.last());
        
        checkLIsFit();
    }
    
    //move all LIs from extra dropdown back to the nav
    function resetExtraDropdown()
    {
        usingExtraDropdown = false;
        
        var LIsToMove = extraDropdown.children();
        
        mainUL.find(".extraDropdown").remove();
        
        mainUL.append(LIsToMove);
    }
  
    //check if to use mobile nav or not
    function checkNavType()
    {
        if(siteWidth != lastSiteWidth)
        {
          if(siteWidth >= breakPoint)
          {
              navControl.hide();
              mainUL.show();
          }
          else {
              navControl.show();
              mainUL.hide();
          }
          
          resetExtraDropdown();
          checkLIsFit();
        }
    }
  
  //open or close nav
    function toggleNav()
    {   
        mainUL.slideToggle();
    }
};

$(function() {
  $(".carousel").on("slide.bs.carousel", function(e) {
    var prev = $(this)
      .find(".active")
      .index();
    var next = $(e.relatedTarget).index();
    var video = $("#video-player")[0];
    var videoSlide = $("#video-player")
      .closest(".carousel-item")
      .index();
    if (next === videoSlide) {
      if (video.tagName == "IFRAME") {
        player.playVideo();
      } else {
        createVideo(video);
      }
    } else {
      if (typeof player !== "undefined") {
        player.pauseVideo();
      }
    }
  });
});

function createVideo(video) {
  var youtubeScriptId = "youtube-api";
  var youtubeScript = document.getElementById(youtubeScriptId);
  var videoId = video.getAttribute("data-video-id");

  if (youtubeScript === null) {
    var tag = document.createElement("script");
    var firstScript = document.getElementsByTagName("script")[0];

    tag.src = "https://www.youtube.com/iframe_api";
    tag.id = youtubeScriptId;
    firstScript.parentNode.insertBefore(tag, firstScript);
  }

  window.onYouTubeIframeAPIReady = function() {
    window.player = new window.YT.Player(video, {
      videoId: videoId,
      playerVars: {
        autoplay: 1,
        modestbranding: 1,
        rel: 0
      }
    });
  };
}
2``