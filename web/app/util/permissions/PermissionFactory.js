Ext.define("ESISystem.util.permissions.PermissionFactory",{
	singleton: true,
	permissions: [],
	getPermissions: function(p){
            var me = this;
            var perms = [];
            
            for(var i = 0; i < p.length; i++){
                var tempPerms = me.getPermission(p[i]);
                for(var x = 0; x < tempPerms.length; x++){
                    perms.push(tempPerms[x]);
                }
            }
            return perms;
	},
	getPermission: function(i){
		return this.permissions[i].clone();
	},
	setup: function(){
		this.permissions.professor = [
                    "professor.permission"
		];
		this.permissions.secretario = [
                    "secretario.permission"
		];
		this.permissions.diretor = [
                    "diretor.permission"
		];
		this.permissions.coordenador = [
                    "coordenador.permission"
		];
	},
	constructor: function(){
		this.setup();
                console.log("Constructor running");
	}
});
