let title = document.title;
window.addEventListener("blur", () => {
    document.title = "Hey, Return back! :(";
});
window.addEventListener("focus", () => {
    document.title = title;
});


const magnetics = document.querySelectorAll(".magnetic");

magnetics.forEach((magnetic) => {
    magnetic.addEventListener("mousemove", function(e){
        const position = magnetic.getBoundingClientRect();
        const x = e.pageX - position.left - position.width / 2;
        const y = e.pageY - position.top - position.height / 2;

        magnetic.children[0].style.transform = "translate(" + x * 0.3 + "px, " + y * 0.5 + "px)";
    });
});

magnetics.forEach((magnetic) => {
    magnetic.addEventListener("mouseout", function(e){
        magnetic.children[0].style.transform = "translate(0px, 0px)";
    });
});