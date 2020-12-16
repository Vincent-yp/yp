$(function () {
    //创建两个数组
    var names=new Array();
    var prices=new Array();
    //使用ajax方法得到服务器数据
    $.get("milkPowderServlet",function (data) {//第一个参数访问地址，第二个参数回调函数
       //遍历对象
       for(var i=0;i<data.length;i++){
           //得到每个奶粉和价格
           names[i]=data[i].name;
           prices[i]=data[i].price;
       }
       //创建图表
        var option={//创建属性
            chart:{
                type:"bar"
            },
            title:{
                text:"按商品销售统计"
            },
            xAxis:{
                //指定x的分类
                categories:names
            },
            yAxis:{
                /*labels:{
                    //显示棵度
                    enabled:true,
                    //自定义显示刻度
                    formatter:function () {
                        return  Highcharts.numberFormat(this.y,2,'.'+'万');
                    }
                },*/
                //设置最小值0
                min:0.0,
                title:{
                    text:"销售金额（万元）"
                }
            },
            //数据数列
            series:[{
                name:"价格",
                //指定价格的数组
                data:prices,
                colorByPoint:true
            }]
        };
       //绑定到div对象上
        $("#container").highcharts(option);
    });
});