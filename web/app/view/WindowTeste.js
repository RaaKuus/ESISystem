Ext.define("ESISystem.view.WindowTeste",{
   extend: "Ext.window.Window",
   xtype: 'windowteste',
   title: "WindowTeste",
   width: 800,
   height: 640,
   items:[
       {
            xtype: 'pdfpanel',
            width: 799,
            height: 599,
            pageScale: 1.8,
            src: 'resources/reports/sass.pdf'
       }
   ]
});