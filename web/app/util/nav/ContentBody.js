Ext.define("ESISystem.util.nav.ContentBody", {
   initial: false,
   status: false,
   open: function(){
       this.status = true;
   },
   close: function(){
       this.status = false;
   },
   isOpen: function(){
       return this.status;
   }
});
