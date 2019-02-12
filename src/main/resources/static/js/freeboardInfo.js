$(document).ready(function () {
    $.ajax({
        url: "/freeboardCommentList",
        type: "get",
        dataType: "json",
        success: function (data) {


        },
        error: function name() {
            alert("실패")
        }
    });
});
