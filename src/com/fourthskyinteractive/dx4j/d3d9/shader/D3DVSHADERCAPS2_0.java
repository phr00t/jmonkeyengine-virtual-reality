package com.fourthskyinteractive.dx4j.d3d9.shader;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("D3D9") 
public class D3DVSHADERCAPS2_0 extends StructObject {
	public D3DVSHADERCAPS2_0() {
		super();
	}
	public D3DVSHADERCAPS2_0(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	@Field(0) 
	public int Caps() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public D3DVSHADERCAPS2_0 Caps(int Caps) {
		this.io.setIntField(this, 0, Caps);
		return this;
	}
	@Field(1) 
	public int DynamicFlowControlDepth() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public D3DVSHADERCAPS2_0 DynamicFlowControlDepth(int DynamicFlowControlDepth) {
		this.io.setIntField(this, 1, DynamicFlowControlDepth);
		return this;
	}
	@Field(2) 
	public int NumTemps() {
		return this.io.getIntField(this, 2);
	}
	@Field(2) 
	public D3DVSHADERCAPS2_0 NumTemps(int NumTemps) {
		this.io.setIntField(this, 2, NumTemps);
		return this;
	}
	@Field(3) 
	public int StaticFlowControlDepth() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public D3DVSHADERCAPS2_0 StaticFlowControlDepth(int StaticFlowControlDepth) {
		this.io.setIntField(this, 3, StaticFlowControlDepth);
		return this;
	}
}
