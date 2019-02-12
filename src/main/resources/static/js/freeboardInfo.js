$(document).ready(function () {
    $.ajax({
        url: "/freeboardCommentList",
        type: "get",
        dataType: "json",
        success: function (data) {
            if (data != null) {
                alert("데이터 전송 완료");
            }

        },
        error: function name() {
            alert("실패")
        }
    });
});
