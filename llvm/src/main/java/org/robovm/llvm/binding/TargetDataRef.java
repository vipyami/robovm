/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.robovm.llvm.binding;

public class TargetDataRef {
  private long swigCPtr;

  protected TargetDataRef(long cPtr, boolean futureUse) {
    swigCPtr = cPtr;
  }

  protected TargetDataRef() {
    swigCPtr = 0;
  }

  protected static long getCPtr(TargetDataRef obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public int hashCode() {
    return 31 + (int) (swigCPtr ^ (swigCPtr >>> 32));
  }

  public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    TargetDataRef other = (TargetDataRef) obj;
    return swigCPtr == other.swigCPtr;
  }
}

