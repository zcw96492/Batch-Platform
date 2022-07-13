/*
Template Name: Color Admin - Responsive Admin Dashboard Template build with Twitter Bootstrap 3.3.7
Version: 2.1.0
Author: zhouchaowei
Website: http://www.seantheme.com/color-admin-v2.1/admin/html/
*/

/** 统计图横坐标定义 */
var getMonthName = function(number) {
    var month = [];
    month[0] = "一月";
    month[1] = "二月";
    month[2] = "三月";
    month[3] = "四月";
    month[4] = "五月";
    month[5] = "六月";
    month[6] = "七月";
    month[7] = "八月";
    month[8] = "九月";
    month[9] = "十月";
    month[10] = "十一月";
    month[11] = "十二月";
    
    return month[number];
};

var getDate = function(date) {
    var currentDate = new Date(date);
    var dd = currentDate.getDate();
    var mm = currentDate.getMonth() + 1;
    var yyyy = currentDate.getFullYear();
    
    if (dd < 10) {
        dd = '0' + dd;
    }
    if (mm < 10) {
        mm = '0' + mm;
    }
    currentDate = yyyy+'-'+mm+'-'+dd;
    
    return currentDate;
};

var handleVisitorsLineChart = function() {
    var green = '#0D888B';
    var greenLight = '#00ACAC';
    var blue = '#3273B1';
    var blueLight = '#348FE2';
    var blackTransparent = 'rgba(0,0,0,0.6)';
    var whiteTransparent = 'rgba(255,255,255,0.4)';
    
    Morris.Line({
        element: 'visitors-line-chart',
        data: [
            {x: '2014-02-01', y: 60, z: 30},
            {x: '2014-03-01', y: 70, z: 40},
            {x: '2014-04-01', y: 40, z: 10},
            {x: '2014-05-01', y: 100, z: 70},
            {x: '2014-06-01', y: 40, z: 10},
            {x: '2014-07-01', y: 80, z: 50},
            {x: '2014-08-01', y: 70, z: 40}
        ],
        xkey: 'x',
        ykeys: ['y', 'z'],
        xLabelFormat: function(x) {
            x = getMonthName(x.getMonth());
            return x.toString();
        },
        labels: ['实时用户流量', '订单成交用户量'],
        lineColors: [green, blue],
        pointFillColors: [greenLight, blueLight],
        lineWidth: '2px',
        pointStrokeColors: [blackTransparent, blackTransparent],
        resize: true,
        gridTextFamily: 'Open Sans',
        gridTextColor: whiteTransparent,
        gridTextWeight: 'normal',
        gridTextSize: '11px',
        gridLineColor: 'rgba(0,0,0,0.5)',
        hideHover: 'auto',
    });
};

var handleVisitorsDonutChart = function() {
    var green = '#00acac';
    var blue = '#348fe2';
    Morris.Donut({
        element: 'visitors-donut-chart',
        data: [
            {label: "新用户", value: 900},
            {label: "老用户", value: 1200}
        ],
        colors: [green, blue],
        labelFamily: 'Open Sans',
        labelColor: 'rgba(255,255,255,0.4)',
        labelTextSize: '12px',
        backgroundColor: '#242a30'
    });
};

var handleVisitorsVectorMap = function() {
    if ($('#visitors-map').length !== 0) {
        $('#visitors-map').vectorMap({
            map: 'world_merc_en',
            scaleColors: ['#e74c3c', '#0071a4'],
            container: $('#visitors-map'),
            normalizeFunction: 'linear',
            hoverOpacity: 0.5,
            hoverColor: false,
            markerStyle: {
                initial: {
                    fill: '#4cabc7',
                    stroke: 'transparent',
                    r: 3
                }
            },
            regions: [{
                attribute: 'fill'
            }],
            regionStyle: {
                initial: {
                    fill: 'rgb(97,109,125)',
                    "fill-opacity": 1,
                    stroke: 'none',
                    "stroke-width": 0.4,
                    "stroke-opacity": 1
                },
                hover: {
                    "fill-opacity": 0.8
                },
                selected: {
                    fill: 'yellow'
                },
                selectedHover: {
                }
            },
            series: {
                regions: [{
                values: {
                    IN:'#00acac',
                    US:'#00acac',
                    KR:'#00acac'
                }
                }]
            },
            focusOn: {
                x: 0.5,
                y: 0.5,
                scale: 2
            },
            backgroundColor: '#2d353c'
        });
    }
};

var handleScheduleCalendar = function() {
    var monthNames = ["January", "February", "March", "April", "May", "June",  "July", "August", "September", "October", "November", "December"];
    var dayNames = ["S", "M", "T", "W", "T", "F", "S"];

    var now = new Date(),
        month = now.getMonth() + 1,
        year = now.getFullYear();

    var events = [
        [
            '2/' + month + '/' + year,
            'Popover Title',
            '#',
            '#00acac',
            'Some contents here'
        ],
        [
            '5/' + month + '/' + year,
            'Tooltip with link',
            'http://www.seantheme.com/color-admin-v1.3',
            '#2d353c'
        ],
        [
            '18/' + month + '/' + year,
            'Popover with HTML Content',
            '#',
            '#2d353c',
            'Some contents here <div class="text-right"><a href="http://www.google.com">view more >>></a></div>'
        ],
        [
            '28/' + month + '/' + year,
            'Color Admin V1.3 Launched',
            'http://www.seantheme.com/color-admin-v1.3',
            '#2d353c',
        ]
    ];
    var calendarTarget = $('#schedule-calendar');
    $(calendarTarget).calendar({
        months: monthNames,
        days: dayNames,
        events: events,
        popover_options:{
            placement: 'top',
            html: true
        }
    });
    $(calendarTarget).find('td.event').each(function() {
        var backgroundColor = $(this).css('background-color');
        $(this).removeAttr('style');
        $(this).find('a').css('background-color', backgroundColor);
    });
    $(calendarTarget).find('.icon-arrow-left, .icon-arrow-right').parent().on('click', function() {
        $(calendarTarget).find('td.event').each(function() {
            var backgroundColor = $(this).css('background-color');
            $(this).removeAttr('style');
            $(this).find('a').css('background-color', backgroundColor);
        });
    });
};

var handleDashboardGritterNotification = function() {
    $(window).load(function() {
        setTimeout(function() {
            $.gritter.add({
                title: '欢迎回来,王佳芝!',
                text: '上次登录时间: 今天上午 10:18:36',
                image: '/img/user-14.jpg',
                sticky: true,
                time: '10:19:33',
                class_name: 'my-sticky-class'
            });
        }, 1000);
    });
};

var DashboardV2 = function () {
	"use strict";
    return {
        //main function
        init: function () {
            handleVisitorsLineChart();
            handleVisitorsDonutChart();
            handleVisitorsVectorMap();
            handleScheduleCalendar();
            handleDashboardGritterNotification();
        }
    };
}();