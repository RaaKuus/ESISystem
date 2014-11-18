Ext.define("ESISystem.view.CadastrarAnoLetivo", {
   extend: 'Ext.form.Panel',
   
   initComponent: function(){
       Ext.apply(this, {
           layout: 'form',
           items: [
               {
                   xtype: 'fieldset', anchor: '98%', title: 'Ano Letivo', defaultType: 'textfield', collapsible:true, items:[
                       {
                           fieldLabel: "Ano Letivo", name: 'anoLetivo', allowBlank: false
                       }
                   ]
               }
           ],
           dockedItems: [
               {
                  xtype: 'button',
                  dock: 'bottom',
                  text: 'Cadastrar Ano Letivo',
                  scope: this,
                  handler: function(){
                      console.log("Clickei na merda toda!");
                  }
               }
           ]
       });
       
       this.callParent(arguments);
   }
});