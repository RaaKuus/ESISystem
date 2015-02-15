Ext.define("ESISystem.util.nav.PanelContentBody", {
   extend: 'ESISystem.util.nav.ContentBody',
   show: function(){
       if(this.isOpen() === false){
            var manager = ESISystem.util.nav.ContentBodyManager;
            var mainPanel = manager.getMainPanel();
            var extPanel = Ext.create(this.path);
            if(extPanel)
                mainPanel.add(extPanel);
            mainPanel.setActiveTab(extPanel);
            this.open();
       }
   },
   hide: function(){
       this.close();
   }
});

