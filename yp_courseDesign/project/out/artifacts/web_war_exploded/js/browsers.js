$(function () {
    var chart;
    $(document).ready(function() {
        chart = new Highcharts.Chart({
            //常规图表选项设置
            chart: {
                renderTo: 'container',        //在哪个区域呈现，对应HTML中的一个元素ID
                plotBackgroundColor: null,    //绘图区的背景颜色
                plotBorderWidth: null,        //绘图区边框宽度
                plotShadow: false            //绘图区是否显示阴影
            },

            //图表的主标题
            title: {
                text: '2014年某网站浏览器浏览器占比'
            },

            //每种图表类型属性设置，通过设置饼图圆周的 开始角度 和 结束角度，我们可以将饼图变成扇形图
            plotOptions: {
                //饼状图
                pie: {
                    allowPointSelect: true,//是否允许被选中
                    cursor: 'pointer',  //光标形状
                    dataLabels: {       //数据标签
                        color: '#000000',
                        connectorColor: '#000000',
                        formatter: function() {
                            //Highcharts.numberFormat(this.percentage,2)格式化数字，保留2位精度
                            return '<b>'+ this.point.name +'</b>: '+Highcharts.numberFormat(this.percentage,2) +' %';
                        }
                    }
                }
            },
            //图表要展现的数据
            series: [{
                type: 'pie',
                name: '市场份额'
            }]
        });
    });
    //异步请求数据
    $.ajax({
        type:"GET",
        url:'browsersServlet',//提供数据的Servlet
        success:function(data){
            //定义一个数组
            browsers = [],
                //迭代，把异步获取的数据放到数组中
                $.each(data,function(i,d){
                    browsers.push([d.name,d.rate]);
                });
            //设置数据
            chart.series[0].setData(browsers);
        },
        error:function(e){
            alert(e);
        }
    });
});

