package com.fourthskyinteractive.dx4j.d3d9.core;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ValuedEnum;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

import com.fourthskyinteractive.dx4j.d3d9.D3D9.D3DBASISTYPE;
import com.fourthskyinteractive.dx4j.d3d9.D3D9.D3DDEGREETYPE;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d3d9") 
public class D3DTRIPATCH_INFO extends StructObject {
	public D3DTRIPATCH_INFO() {
		super();
	}
	public D3DTRIPATCH_INFO(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	@Field(0) 
	public int StartVertexOffset() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public D3DTRIPATCH_INFO StartVertexOffset(int StartVertexOffset) {
		this.io.setIntField(this, 0, StartVertexOffset);
		return this;
	}
	@Field(1) 
	public int NumVertices() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public D3DTRIPATCH_INFO NumVertices(int NumVertices) {
		this.io.setIntField(this, 1, NumVertices);
		return this;
	}
	/// C type : D3DBASISTYPE
	@Field(2) 
	public ValuedEnum<D3DBASISTYPE > Basis() {
		return this.io.getEnumField(this, 2);
	}
	/// C type : D3DBASISTYPE
	@Field(2) 
	public D3DTRIPATCH_INFO Basis(ValuedEnum<D3DBASISTYPE > Basis) {
		this.io.setEnumField(this, 2, Basis);
		return this;
	}
	/// C type : D3DDEGREETYPE
	@Field(3) 
	public ValuedEnum<D3DDEGREETYPE > Degree() {
		return this.io.getEnumField(this, 3);
	}
	/// C type : D3DDEGREETYPE
	@Field(3) 
	public D3DTRIPATCH_INFO Degree(ValuedEnum<D3DDEGREETYPE > Degree) {
		this.io.setEnumField(this, 3, Degree);
		return this;
	}
}
