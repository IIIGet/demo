var elee = document.getElementsByTagName("button")[0];
elee.onclick = function () {
    swal({
        title: "已确定",
        type: "success",
        confirmButtonText: "确定",
        closeOnConfirm: false
    });
}
var ele = document.getElementsByTagName("button")[1];
ele.onclick = function () {
    swal({
        title: "添加成功",
        type: "success",
        confirmButtonText: "确定",
        closeOnConfirm: false
    });
}

var increment = document.getElementsByClassName("increase");

var decrement = document.getElementsByClassName("decrease");

for (var i = 0; i < increment.length; i++) {
    //为a标签添加index属性，用于记录下标
    increment[i].index = i;

    //点击+数量增加的功能函数
    increment[i].onclick = function () {
        var flag = this.index;

        //获取当前按钮对应的数量框
        var q = document.getElementsByClassName("quantity")[flag];

        var newvalue = parseInt(q.value) + 1;

        q.setAttribute('value', newvalue);

        //更新此商品对应的‘小计’
        changeSum(flag, newvalue);
    }
}

for (var i = 0; i < decrement.length; i++) {
    //为a标签添加index属性，用于记录下标
    decrement[i].index = i;

    //点击-数量减少的功能函数
    decrement[i].onclick = function () {
        var flag = this.index;

        //获取当前按钮对应的数量框
        var q = document.getElementsByClassName("quantity")[flag];

        var newvalue = parseInt(q.value) - 1;

        q.setAttribute('value', newvalue);

        //更新此商品对应的‘小计’
        changeSum(flag, newvalue);
    }
}
// //更新每个商品的‘小计’
// function changeSum(flag, num) {
//     //获取对应商品单价所在的标签
//     var temp = document.getElementsByClassName("onlyPrice")[flag];
//
//     //获取商品单价
//     var unitPrice = temp.innerHTML;
//
//     //计算新的小计价格
//     var newPrice = (parseFloat(unitPrice) * (num*1.0)).toFixed(1);
//     //获取当前“小计”的标签
//     var sum = document.getElementsByClassName("onlySum")[flag];
//
//     sum.innerHTML = newPrice;
// }