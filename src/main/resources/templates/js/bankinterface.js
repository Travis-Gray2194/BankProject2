$(document).ready(function() {
  
  $('.list li').hover(function() {
    $(this).find('i').css('opacity','0.75');
  }, function() {
    $(this).find('i').css('opacity','0.25');
  })
  
  var tl = new TimelineMax({paused:false});
  
  $('.list li').each(function() {
    
  
  
    var open = false;

    $(this).click(function() {

      var i = $(this).find('i');
      var li = $(this);
      var desc = $(this).next();
      

      if (open === true) {
        tl.to(i, .3, {rotation: 0})
          .to(li, .3, {borderBottom: 'none'}, '-=.3')
          .to(desc, .3, {height: '0', padding: '0', ease:Power4.easeOut}, '-=.3');
        open = false;
      } else {
        tl.to(i, .4, {rotation: 90})
          .to(li, .4, {borderBottom: '2px solid #95a5a6'}, '-=.4')
          .to(desc, .4, {height: '55px', padding: '5px', ease:Bounce.easeOut}, '-=.4');
        open = true;
      }


    });
  
  });
});