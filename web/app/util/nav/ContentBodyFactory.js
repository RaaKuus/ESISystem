Ext.define("ESISystem.util.nav.ContentBodyFactory", {
   singleton: true,
   types: {
       'window': 0,
       'panel': 1
   },
   contents: [
       "ESISystem.util.nav.WindowContentBody",
       "ESISystem.util.nav.PanelContentBody"
   ],
   createContentBody: function(options){
        console.log(options);
        var content = Ext.create(this.contents[this.types[options.type]]);
        content.name = options.name;
        content.path = options.path;
        content.initial = typeof options.initial === 'undefined' ? false : options.initial;
        return content;
   }
});

