Ext.define("ESISystem.util.nav.ContentBodyLoader", {
   singleton: true,
   initialized: false,
   registers: [],
   initialize: function(mainPanel){
       if(this.initialized){
           throw "ContentBodyLoader já foi iniciado!";
       } else {
           var manager = ESISystem.util.nav.ContentBodyManager;
           var factory = ESISystem.util.nav.ContentBodyFactory;
           console.log(manager);
           manager.setMainPanel(mainPanel);
           
           this.registers.forEach(function(obj){
               manager.register(factory.createContentBody(obj));
           });
           manager.getInitialContents().forEach(function(obj){
              obj.show(); 
           });
           this.initialized = true;
       }
   },
   add: function(register){
       for(var i = 0; this.registers.lenght; i++){
           if(register.name === this.registers[i].name){
               throw "Ligação já Registrada";
           }
       }
       this.registers.push(register);
   }
});

