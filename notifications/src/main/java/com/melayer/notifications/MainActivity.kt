package com.melayer.notifications

import android.app.Dialog
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAlert.setOnClickListener {
            //openAlterDialog()
            openDialog()
        }

    }

    private fun openDialog() {

        val dialog=Dialog(this)
        dialog.setContentView(R.layout.dialog_logout)
        dialog.setCancelable(false)
        dialog.setCanceledOnTouchOutside(false)
        val btnNo=dialog.findViewById<Button>(R.id.btnNo)
        val btnYes=dialog.findViewById<Button>(R.id.btnYes)
        btnYes.setOnClickListener {
            dialog.dismiss()
            finish()
        }
        btnNo.setOnClickListener {
            dialog.dismiss()
        }


        dialog.show()

    }

    private fun openAlterDialog() {
        val builder=AlertDialog.Builder(this)
        builder.setMessage("Are you sure to LOGOUT ?")

        builder.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->

                dialog.dismiss()
                finish()
        })
        builder.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->
                dialog.dismiss()
        })
        builder.create()
        builder.show()
    }
}
