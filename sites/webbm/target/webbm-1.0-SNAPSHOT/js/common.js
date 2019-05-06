$(function () {
    // 轮播图初始化
    function lbtInit(lbtId) {
        var mySwiper = new Swiper(lbtId, {
            autoplay: 3000,
            loop: true,
            // 如果需要分页器
            pagination: '.swiper-pagination',
            // 如果需要前进后退按钮
            nextButton: '.swiper-button-next',
            prevButton: '.swiper-button-prev',
        })
    }

    // tab栏
    function tabInit() {
        $(".tab-nav").on("click", "li", function () {
            $(this).addClass("tab-active").siblings().removeClass("tab-active")

            $(".tab-content div").eq($(this).index()).animate({marginLeft: "0"}).siblings().animate({marginLeft: "-500px"})
        })
    }

    // 屏幕滚动固定搜索框
    var oInfo = $("header");
    var oTop = $("#swiper-container1").offset().top;
    var sTop = 0;
    $(window).scroll(function () {
        // console.log(123)
        sTop = $(this).scrollTop();
        // console.log(sTop)
        // console.log(oTop)
        if (sTop >= oTop) {
            $("#search").addClass("search-fix w")
        } else {
            $("#search").removeClass("search-fix w")
        }
    });


    var locationUrl = location.href
    var urlArr = locationUrl.split("/")
    var newUrlArr = urlArr[urlArr.length - 1].split(".")
    if (newUrlArr[0] != "brands") {
        lbtInit("#swiper-container1")
    }


    lbtInit("#swiper-container2")
    tabInit()
})