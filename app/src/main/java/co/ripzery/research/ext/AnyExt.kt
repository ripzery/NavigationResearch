package co.ripzery.research.ext

import android.util.Log

/*
 * OmiseGO
 *
 * Created by Phuchit Sirimongkolsathien on 8/10/2018 AD.
 * Copyright © 2017-2018 OmiseGO. All rights reserved.
 */

fun Any.log(msg: String) {
    Log.d(this::class.java.simpleName, msg)
}
