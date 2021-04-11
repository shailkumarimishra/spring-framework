module moduleC{
//	exports pack4;//It will be visible to all other modules
//	exports pack4 to moduleA;//It will be visible to only moduleA
//	exports pack2,pack3;//invalid
//	exports moduleA;//exports directive can only export package.
//	exports pack2,pack3 to moduleA;//not allowed
//	requires moduleA;//it will import only modules.
//	requires moduleA,moduleB;//not allowed
//	requires static moduleB;//here moduleB is optional for moduleC.
//	requires transitive moduleB;
//	uses <Interface or Abstract Class not implementation>
//	provides<Interface or Abstract Class> with <implementation class>
//	opens com.sirt.package;
//	opens com.sirt.package to moduleA,moduleB;
}