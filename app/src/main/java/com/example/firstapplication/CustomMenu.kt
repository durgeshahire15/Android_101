package com.example.firstapplication

import android.content.Context
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu

class CustomMenu {
    fun showMenu(context: Context, view: View){
        val pop = PopupMenu(context, view)
        pop.inflate(R.menu.menu)

        pop.setOnMenuItemClickListener {
            when(it!!.itemId){
                R.id.edit -> {Toast.makeText(context, "Hi i am editing", Toast.LENGTH_SHORT).show()
                true
                }
                R.id.share -> {Toast.makeText(context, "Hi i am sharing", Toast.LENGTH_SHORT).show()
                    true}
                R.id.delete -> {Toast.makeText(context, "Hi i am deleting", Toast.LENGTH_SHORT).show()
                    true}
                else -> false
            }

        }

        try{
            val fieldMpopup = PopupMenu::class.java.getDeclaredField("mPopup")
            fieldMpopup.isAccessible = true
            val mPopup = fieldMpopup.get(pop)

            mPopup.javaClass.
            getDeclaredMethod("setForceShowIcon", Boolean::class.java)
                .invoke(mPopup, true)
        }
        catch (e:Exception){}
        finally{
            pop.show()
        }
    }
}