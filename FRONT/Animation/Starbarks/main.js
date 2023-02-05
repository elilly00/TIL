let mainText = document.querySelector("h1");

window.addEventListener('scroll', function(){
    // 스크롤 높이 설정
    // scrollY : 스크롤 높이
    let value = window.scrollY
    console.log("scrollY", value);

    if(value > 300){
        mainText.style.animation = 'disappear 2s ease-out forwards'; 
        // forwards를 사용하면 사라진 상태에서 유지됨
    } else { // forwards를 사용해 사라진 텍스트를 다시 돌아오도록 함
        mainText.style.animation = 'slide 2s ease-out';
    }
});
