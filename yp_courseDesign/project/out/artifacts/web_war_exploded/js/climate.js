$(function () {
    //创建两个数组
    var names=new Array();
    var months=new Array();
    var degrees=new Array();
    var niudegrees=new Array();
    var bodegrees=new Array();
    var lundegree=new Array();
    //使用ajax方法得到服务器数据
    $.get("climateServlet",function (data) {//第一个参数访问地址，第二个参数回调函数
        //遍历对象
        for(var i=0;i<data.length;i++){
            //得到每个城市和温度
            names[i]=data[i].name;
            months[i]=data[i].month;
            degrees[i]=data[i].degree;
            niudegrees[i]=data[i].niudegree;
            bodegrees[i]=data[i].bodegree;
            lundegree[i]=data[i].lundegree;
        }
        //alert(names)
        //创建图表
        var option={//创建属性
            chart:{
                type:"line"
            },
            title:{
                text:"不同城市的月平均气温",
                x: -20 //center
            },
            subtitle:{
              text:"数据来源: WorldClimate.com"
            },
            xAxis:{
                //指定x的分类
                categories:months//['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun','Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
            },
            yAxis:{
                title:{
                  text:"温度（℃）"
                },

                //设置最小值0
                value:12,
                step:2,
                plotLines: [{
                    value: 0,//水平参照线
                    width: 2,//水平参照线宽度
                    color: '#808080'
                }]

            },
            legend: {//图例，也就是最右边的
                layout: 'vertical', //垂直布局
                align: 'right',     //右边
                verticalAlign: 'middle',    //垂直对齐
                borderWidth: 0
            },
            //数据数列
            series:[{
                name:'东京',
                //指定温度
                data:degrees
                //colorByPoint:true
            },
                {
                    name:'纽约',
                    data:niudegrees
                },
                {
                    name:'柏林',
                    data:bodegrees
                },
                {
                    name:'伦敦',
                    data:lundegree
                }
            ]
        };
        //绑定到div对象上
        $("#container").highcharts(option);
    });
});