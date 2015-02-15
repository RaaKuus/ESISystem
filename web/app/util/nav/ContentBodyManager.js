Ext.define("ESISystem.util.nav.ContentBodyManager", {
   singleton: true,
   mainPanel: null,
   contents: [],
   setMainPanel: function(mp){
       this.mainPanel = mp;
   },
   getMainPanel: function(){
       return this.mainPanel;
   },
   getInitialContents: function(){
       var arr = [];
       this.contents.forEach(function(obj){
          if(obj.initial)
              arr.push(obj);
       });
       return arr;
   },
   register: function(content){
       for(var i = 0; i < this.contents.length; i++){
           if(content.name === this.contents[i].name){
               throw "Um ContentBody com o mesmo nome já foi registrado!";
               return;
           }
       }
       this.contents.push(content);
   },
   registerArr: function(contentArr){
       var me = this;
       contentArr.forEach(function(obj){
           me.register(obj);
       });
   },
   getContent: function(name){
       for(var i = 0; i < this.contents.length; i++){
           if(this.contents[i].name === name){
               return this.contents[i];
           }
       }
   },
   close : function(panel, eOpts){
        var manager = this;
        var panelCB = manager.getContent(panel.title);
        console.log(panelCB);
        panelCB.hide();
    }
   
});