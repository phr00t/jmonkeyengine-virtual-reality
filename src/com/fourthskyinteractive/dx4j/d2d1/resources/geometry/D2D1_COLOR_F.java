package com.fourthskyinteractive.dx4j.d2d1.resources.geometry;
import static com.fourthskyinteractive.dx4j.d2d1.D2D1.sc_blueMask;
import static com.fourthskyinteractive.dx4j.d2d1.D2D1.sc_blueShift;
import static com.fourthskyinteractive.dx4j.d2d1.D2D1.sc_greenMask;
import static com.fourthskyinteractive.dx4j.d2d1.D2D1.sc_greenShift;
import static com.fourthskyinteractive.dx4j.d2d1.D2D1.sc_redMask;
import static com.fourthskyinteractive.dx4j.d2d1.D2D1.sc_redShift;

import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;

import com.fourthskyinteractive.dx4j.d2d1.D2D1.ColorF;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d2d1") 
public class D2D1_COLOR_F extends StructObject {
	
	public D2D1_COLOR_F() {
		super();
	}
	public D2D1_COLOR_F(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	
	public D2D1_COLOR_F(ColorF rgb, float alpha) {
		super();
		r(((rgb.value & sc_redMask) >> sc_redShift ) / 255.0f);
		g(((rgb.value & sc_greenMask) >> sc_greenShift ) / 255.0f);
		b(((rgb.value & sc_blueMask) >> sc_blueShift ) / 255.0f);
		a(alpha);
	}
	public D2D1_COLOR_F(ColorF rgb) {
		this(rgb, 1.0f);
	}

	@Field(0) 
	public float r() {
		return this.io.getFloatField(this, 0);
	}
	@Field(0) 
	public D2D1_COLOR_F r(float r) {
		this.io.setFloatField(this, 0, r);
		return this;
	}
	@Field(1) 
	public float g() {
		return this.io.getFloatField(this, 1);
	}
	@Field(1) 
	public D2D1_COLOR_F g(float g) {
		this.io.setFloatField(this, 1, g);
		return this;
	}
	@Field(2) 
	public float b() {
		return this.io.getFloatField(this, 2);
	}
	@Field(2) 
	public D2D1_COLOR_F b(float b) {
		this.io.setFloatField(this, 2, b);
		return this;
	}
	@Field(3) 
	public float a() {
		return this.io.getFloatField(this, 3);
	}
	@Field(3) 
	public D2D1_COLOR_F a(float a) {
		this.io.setFloatField(this, 3, a);
		return this;
	}
}
