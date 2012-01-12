/* DO NOT EDIT THIS FILE!  It was generated by utils/apivergen.abc. */

/* ***** BEGIN LICENSE BLOCK *****
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License+"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is [Open Source Virtual Machine].
 *
 * The Initial Developer of the Original Code is
 * Adobe System Incorporated.
 * Portions created by the Initial Developer are Copyright (C) 2008
 * the Initial Developer. All Rights Reserved.
 *
 * Contributor(s):
 *   Adobe AS3 Team
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL+"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 *
 * ***** END LICENSE BLOCK ***** */


package adobe.abc;

public class APIVersions {

public static final int kApiVersionSeries_AIR = 0;
public static final int kApiVersionSeries_FP = 1;

public static final int kApiVersionSeries_count = 2;

public static final int kApiVersion_VM_ALLVERSIONS = 0;
public static final int kApiVersion_AIR_1_0 = 1;
public static final int kApiVersion_FP_10_0 = 2;
public static final int kApiVersion_AIR_1_5 = 3;
public static final int kApiVersion_AIR_1_5_1 = 4;
public static final int kApiVersion_FP_10_0_32 = 5;
public static final int kApiVersion_AIR_1_5_2 = 6;
public static final int kApiVersion_FP_10_1 = 7;
public static final int kApiVersion_AIR_2_0 = 8;
public static final int kApiVersion_AIR_2_5 = 9;
public static final int kApiVersion_FP_10_2 = 10;
public static final int kApiVersion_AIR_2_6 = 11;
public static final int kApiVersion_SWF_12 = 12;
public static final int kApiVersion_AIR_2_7 = 13;
public static final int kApiVersion_SWF_13 = 14;
public static final int kApiVersion_AIR_3_0 = 15;
public static final int kApiVersion_SWF_14 = 16;
public static final int kApiVersion_AIR_3_1 = 17;
public static final int kApiVersion_SWF_15 = 18;
public static final int kApiVersion_AIR_3_2 = 19;
public static final int kApiVersion_SWF_16 = 20;
public static final int kApiVersion_VM_INTERNAL = 21;

public static final int kApiVersion_count = 22;

public static final String kApiVersionNames[]= {
    "VM_ALLVERSIONS", 
    "AIR_1_0", 
    "FP_10_0", 
    "AIR_1_5", 
    "AIR_1_5_1", 
    "FP_10_0_32", 
    "AIR_1_5_2", 
    "FP_10_1", 
    "AIR_2_0", 
    "AIR_2_5", 
    "FP_10_2", 
    "AIR_2_6", 
    "SWF_12", 
    "AIR_2_7", 
    "SWF_13", 
    "AIR_3_0", 
    "SWF_14", 
    "AIR_3_1", 
    "SWF_15", 
    "AIR_3_2", 
    "SWF_16", 
    "VM_INTERNAL"
};

public static final int kApiVersionSeriesMembership[kApiVersion_count] = {
    (1<<kApiVersionSeries_AIR)|(1<<kApiVersionSeries_FP),
    (1<<kApiVersionSeries_AIR),
    (1<<kApiVersionSeries_FP),
    (1<<kApiVersionSeries_AIR),
    (1<<kApiVersionSeries_AIR),
    (1<<kApiVersionSeries_FP),
    (1<<kApiVersionSeries_AIR),
    (1<<kApiVersionSeries_FP),
    (1<<kApiVersionSeries_AIR),
    (1<<kApiVersionSeries_AIR),
    (1<<kApiVersionSeries_FP),
    (1<<kApiVersionSeries_AIR),
    (1<<kApiVersionSeries_FP),
    (1<<kApiVersionSeries_AIR),
    (1<<kApiVersionSeries_FP),
    (1<<kApiVersionSeries_AIR),
    (1<<kApiVersionSeries_FP),
    (1<<kApiVersionSeries_AIR),
    (1<<kApiVersionSeries_FP),
    (1<<kApiVersionSeries_AIR),
    (1<<kApiVersionSeries_FP),
    (1<<kApiVersionSeries_AIR)|(1<<kApiVersionSeries_FP)
};

public static final int kApiVersionSeriesTransfer[kApiVersion_count][kApiVersionSeries_count] = {
    { kApiVersion_VM_ALLVERSIONS, kApiVersion_VM_ALLVERSIONS }, // VM_ALLVERSIONS
    { kApiVersion_AIR_1_0, kApiVersion_VM_INTERNAL }, // AIR_1_0
    { kApiVersion_AIR_1_5, kApiVersion_FP_10_0 }, // FP_10_0
    { kApiVersion_AIR_1_5, kApiVersion_VM_INTERNAL }, // AIR_1_5
    { kApiVersion_AIR_1_5_1, kApiVersion_VM_INTERNAL }, // AIR_1_5_1
    { kApiVersion_AIR_1_5_2, kApiVersion_FP_10_0_32 }, // FP_10_0_32
    { kApiVersion_AIR_1_5_2, kApiVersion_VM_INTERNAL }, // AIR_1_5_2
    { kApiVersion_AIR_2_0, kApiVersion_FP_10_1 }, // FP_10_1
    { kApiVersion_AIR_2_0, kApiVersion_VM_INTERNAL }, // AIR_2_0
    { kApiVersion_AIR_2_5, kApiVersion_VM_INTERNAL }, // AIR_2_5
    { kApiVersion_AIR_2_6, kApiVersion_FP_10_2 }, // FP_10_2
    { kApiVersion_AIR_2_6, kApiVersion_VM_INTERNAL }, // AIR_2_6
    { kApiVersion_AIR_2_7, kApiVersion_SWF_12 }, // SWF_12
    { kApiVersion_AIR_2_7, kApiVersion_VM_INTERNAL }, // AIR_2_7
    { kApiVersion_AIR_3_0, kApiVersion_SWF_13 }, // SWF_13
    { kApiVersion_AIR_3_0, kApiVersion_VM_INTERNAL }, // AIR_3_0
    { kApiVersion_AIR_3_1, kApiVersion_SWF_14 }, // SWF_14
    { kApiVersion_AIR_3_1, kApiVersion_VM_INTERNAL }, // AIR_3_1
    { kApiVersion_AIR_3_2, kApiVersion_SWF_15 }, // SWF_15
    { kApiVersion_AIR_3_2, kApiVersion_VM_INTERNAL }, // AIR_3_2
    { kApiVersion_VM_INTERNAL, kApiVersion_SWF_16 }, // SWF_16
    { kApiVersion_VM_INTERNAL, kApiVersion_VM_INTERNAL } // VM_INTERNAL
};

public static final int kApiVersionFirst[kApiVersionSeries_count] = {
    kApiVersion_AIR_1_0,
    kApiVersion_FP_10_0
};

public static final int kApiVersionLatest[kApiVersionSeries_count] = {
    kApiVersion_AIR_3_2,
    kApiVersion_SWF_16
};

};
