package com.fourthskyinteractive.dx4j.dxgi;
import org.bridj.Pointer;
import org.bridj.ann.Library;
import org.bridj.ann.Runtime;
import org.bridj.ann.Virtual;
import org.bridj.cpp.com.COMRuntime;
import org.bridj.cpp.com.IID;

import com.fourthskyinteractive.dx4j.dxgi.adapter.IDXGIAdapter1;
/**
 * <i>native declaration : DXGI.h:2230</i><br>
 * Error: Conversion Error : uuid("aec22fb8-76f3-4639-9be0-28eb43a67a2e") novtable struct IDXGIObject {<br>
 * 	/// Original signature : <code>int SetPrivateData(const GUID&, UINT, const void*)</code><br>
 * 	virtual int SetPrivateData(const GUID& Name, UINT DataSize, const void* pData);<br>
 * 	/// Original signature : <code>int SetPrivateDataInterface(const GUID&, const IUnknown*)</code><br>
 * 	virtual int SetPrivateDataInterface(const GUID& Name, const IUnknown* pUnknown);<br>
 * 	/// Original signature : <code>int GetPrivateData(const GUID&, UINT*, void*)</code><br>
 * 	virtual int GetPrivateData(const GUID& Name, UINT* pDataSize, void* pData);<br>
 * 	/// Original signature : <code>int GetParent(const IID&, void**)</code><br>
 * 	virtual int GetParent(const IID& riid, void** ppParent);<br>
 * } (Cannot find parent IUnknown of struct uuid("aec22fb8-76f3-4639-9be0-28eb43a67a2e") novtable struct IDXGIObject {<br>
 * 	/// Original signature : <code>int SetPrivateData(const GUID&, UINT, const void*)</code><br>
 * 	virtual int SetPrivateData(const GUID& Name, UINT DataSize, const void* pData);<br>
 * 	/// Original signature : <code>int SetPrivateDataInterface(const GUID&, const IUnknown*)</code><br>
 * 	virtual int SetPrivateDataInterface(const GUID& Name, const IUnknown* pUnknown);<br>
 * 	/// Original signature : <code>int GetPrivateData(const GUID&, UINT*, void*)</code><br>
 * 	virtual int GetPrivateData(const GUID& Name, UINT* pDataSize, void* pData);<br>
 * 	/// Original signature : <code>int GetParent(const IID&, void**)</code><br>
 * 	virtual int GetParent(const IID& riid, void** ppParent);<br>
 * })<br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.free.fr/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@IID("770aae78-f26f-4dba-a829-253c83d1b387") 
@Library("dxgi") 
@Runtime(COMRuntime.class)
public class IDXGIFactory1 extends IDXGIFactory {
	public IDXGIFactory1() {
		super();
	}
//	public IDXGIFactory1(Pointer pointer) {
//		super(pointer);
//	}
	@Virtual(0) 
	public native int EnumAdapters1(int Adapter, Pointer<Pointer<IDXGIAdapter1 > > ppAdapter);
	@Virtual(1) 
	public native int IsCurrent();
}
