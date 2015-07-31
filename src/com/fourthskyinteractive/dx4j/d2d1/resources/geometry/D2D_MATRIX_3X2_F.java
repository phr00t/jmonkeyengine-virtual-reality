package com.fourthskyinteractive.dx4j.d2d1.resources.geometry;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d2d1") 
public class D2D_MATRIX_3X2_F extends StructObject {
	public D2D_MATRIX_3X2_F() {
		super();
	}
	public D2D_MATRIX_3X2_F(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	@Field(0) 
	public float _11() {
		return this.io.getFloatField(this, 0);
	}
	@Field(0) 
	public D2D_MATRIX_3X2_F _11(float _11) {
		this.io.setFloatField(this, 0, _11);
		return this;
	}
	@Field(1) 
	public float _12() {
		return this.io.getFloatField(this, 1);
	}
	@Field(1) 
	public D2D_MATRIX_3X2_F _12(float _12) {
		this.io.setFloatField(this, 1, _12);
		return this;
	}
	@Field(2) 
	public float _21() {
		return this.io.getFloatField(this, 2);
	}
	@Field(2) 
	public D2D_MATRIX_3X2_F _21(float _21) {
		this.io.setFloatField(this, 2, _21);
		return this;
	}
	@Field(3) 
	public float _22() {
		return this.io.getFloatField(this, 3);
	}
	@Field(3) 
	public D2D_MATRIX_3X2_F _22(float _22) {
		this.io.setFloatField(this, 3, _22);
		return this;
	}
	@Field(4) 
	public float _31() {
		return this.io.getFloatField(this, 4);
	}
	@Field(4) 
	public D2D_MATRIX_3X2_F _31(float _31) {
		this.io.setFloatField(this, 4, _31);
		return this;
	}
	@Field(5) 
	public float _32() {
		return this.io.getFloatField(this, 5);
	}
	@Field(5) 
	public D2D_MATRIX_3X2_F _32(float _32) {
		this.io.setFloatField(this, 5, _32);
		return this;
	}
}
