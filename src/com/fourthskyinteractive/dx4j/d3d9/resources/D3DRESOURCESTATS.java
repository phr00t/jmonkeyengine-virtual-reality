package com.fourthskyinteractive.dx4j.d3d9.resources;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("d3d9") 
public class D3DRESOURCESTATS extends StructObject {
	public D3DRESOURCESTATS() {
		super();
	}
	public D3DRESOURCESTATS(Pointer<? extends StructObject> pointer) {
		super(pointer);
	}
	@Field(0) 
	public int bThrashing() {
		return this.io.getIntField(this, 0);
	}
	@Field(0) 
	public D3DRESOURCESTATS bThrashing(int bThrashing) {
		this.io.setIntField(this, 0, bThrashing);
		return this;
	}
	@Field(1) 
	public int ApproxBytesDownloaded() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public D3DRESOURCESTATS ApproxBytesDownloaded(int ApproxBytesDownloaded) {
		this.io.setIntField(this, 1, ApproxBytesDownloaded);
		return this;
	}
	@Field(2) 
	public int NumEvicts() {
		return this.io.getIntField(this, 2);
	}
	@Field(2) 
	public D3DRESOURCESTATS NumEvicts(int NumEvicts) {
		this.io.setIntField(this, 2, NumEvicts);
		return this;
	}
	@Field(3) 
	public int NumVidCreates() {
		return this.io.getIntField(this, 3);
	}
	@Field(3) 
	public D3DRESOURCESTATS NumVidCreates(int NumVidCreates) {
		this.io.setIntField(this, 3, NumVidCreates);
		return this;
	}
	@Field(4) 
	public int LastPri() {
		return this.io.getIntField(this, 4);
	}
	@Field(4) 
	public D3DRESOURCESTATS LastPri(int LastPri) {
		this.io.setIntField(this, 4, LastPri);
		return this;
	}
	@Field(5) 
	public int NumUsed() {
		return this.io.getIntField(this, 5);
	}
	@Field(5) 
	public D3DRESOURCESTATS NumUsed(int NumUsed) {
		this.io.setIntField(this, 5, NumUsed);
		return this;
	}
	@Field(6) 
	public int NumUsedInVidMem() {
		return this.io.getIntField(this, 6);
	}
	@Field(6) 
	public D3DRESOURCESTATS NumUsedInVidMem(int NumUsedInVidMem) {
		this.io.setIntField(this, 6, NumUsedInVidMem);
		return this;
	}
	@Field(7) 
	public int WorkingSet() {
		return this.io.getIntField(this, 7);
	}
	@Field(7) 
	public D3DRESOURCESTATS WorkingSet(int WorkingSet) {
		this.io.setIntField(this, 7, WorkingSet);
		return this;
	}
	@Field(8) 
	public int WorkingSetBytes() {
		return this.io.getIntField(this, 8);
	}
	@Field(8) 
	public D3DRESOURCESTATS WorkingSetBytes(int WorkingSetBytes) {
		this.io.setIntField(this, 8, WorkingSetBytes);
		return this;
	}
	@Field(9) 
	public int TotalManaged() {
		return this.io.getIntField(this, 9);
	}
	@Field(9) 
	public D3DRESOURCESTATS TotalManaged(int TotalManaged) {
		this.io.setIntField(this, 9, TotalManaged);
		return this;
	}
	@Field(10) 
	public int TotalBytes() {
		return this.io.getIntField(this, 10);
	}
	@Field(10) 
	public D3DRESOURCESTATS TotalBytes(int TotalBytes) {
		this.io.setIntField(this, 10, TotalBytes);
		return this;
	}
}
