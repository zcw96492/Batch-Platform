/*
Template Name: 中国人寿新一代规则管理系统
Version: 1.0.0
Author: zhouchaowei
date: 2021-08-31
*/
var Index = function () {
    "use strict";
    return {
        //main function
        init: function () {
            handleVisitorsLineChart();
            handleVisitorsDonutChart();
            handleScheduleCalendar();
            handleDashboardGritterNotification();
        }
    };
}();


var getMonthName = function(number) {
    var month = [];
    month[0] = "Jan";
    month[1] = "Feb";
    month[2] = "Mar";
    month[3] = "Apr";
    month[4] = "May";
    month[5] = "Jun";
    month[6] = "Jul";
    month[7] = "Aug";
    month[8] = "Sep";
    month[9] = "Oct";
    month[10] = "Nov";
    month[11] = "Dec";
    
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
            {x: '2021-01-01', y: 23, z: 70},
            {x: '2021-02-01', y: 60, z: 30},
            {x: '2021-03-01', y: 70, z: 40},
            {x: '2021-04-01', y: 40, z: 10},
            {x: '2021-05-01', y: 100, z: 70},
            {x: '2021-06-01', y: 40, z: 10},
            {x: '2021-07-01', y: 80, z: 50},
            {x: '2021-08-01', y: 70, z: 40},
            {x: '2021-09-01', y: 60, z: 30},
            {x: '2021-10-01', y: 10, z: 40},
            {x: '2021-11-01', y: 20, z: 50},
            {x: '2021-12-01', y: 30, z: 60}
        ],
        xkey: 'x',
        ykeys: ['y', 'z'],
        xLabelFormat: function(x) {
            x = getMonthName(x.getMonth());
            return x.toString();
        },
        labels: ['执行成功任务数', '任务执行失败数'],
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
    const green = '#00acac';
    const blue = '#3273B1';
    Morris.Donut({
        element: 'visitors-donut-chart',
        data: [
            {label: "任务执行失败", value: 500},
            {label: "任务执行成功", value: 1600}
        ],
        colors: [blue,green],
        labelFamily: 'Open Sans',
        labelColor: 'rgba(255,255,255,0.4)',
        labelTextSize: '12px',
        backgroundColor: '#242a30'
    });
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
                title: '欢迎回来, 陈月钗!',
                image: '/img/user-14.jpg',
                sticky: true,
                time: new Date(),
                class_name: 'my-sticky-class'
            });
        }, 1000);
    });
};


/* 注销按钮实现 */
