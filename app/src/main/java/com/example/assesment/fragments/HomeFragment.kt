package com.example.assesment.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import com.example.assesment.R
import com.example.assesment.topup
import com.example.assesment.transfer

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val linearLayout1 = view.findViewById<LinearLayout>(R.id.transfer)
        val linearLayout2 = view.findViewById<LinearLayout>(R.id.balance)
        val scanQRLayout = view.findViewById<LinearLayout>(R.id.scanQR)

        // Tambahkan OnClickListener untuk LinearLayout
        linearLayout1.setOnClickListener {
            // Tindakan yang akan dilakukan saat LinearLayout ditekan
            // Misalnya, pindah ke aktivitas "TransferActivity"
            val intent = Intent(context, com.example.assesment.transfer::class.java)
            startActivity(intent)
        }

        // Tambahkan OnClickListener untuk LinearLayout


        linearLayout2.setOnClickListener {
            val fragmentTransaction = parentFragmentManager.beginTransaction()
            val balanceFragment = BalanceFragment() // Gantilah dengan nama fragment yang sesuai

            fragmentTransaction.replace(R.id.fl_wrapper, balanceFragment)
            fragmentTransaction.addToBackStack(null) // Jika Anda ingin menambahkannya ke back stack
            fragmentTransaction.commit()
        }

        val topupButton = view.findViewById<Button>(R.id.topup)
        topupButton.setOnClickListener {
            // Tindakan yang akan dilakukan saat tombol "Top Up" ditekan
            // Misalnya, pindah ke aktivitas "TopupActivity"
            val intent = Intent(context, topup::class.java)
            startActivity(intent)
        }

        scanQRLayout.setOnClickListener {
            // Tindakan yang akan dilakukan saat LinearLayout "Scan QR" ditekan
            // Misalnya, tampilkan pesan "Coming Soon" menggunakan Toast
            Toast.makeText(context, "Coming Soon", Toast.LENGTH_SHORT).show()
        }


        // ... (Tambahkan kode lain jika diperlukan)

        return view
    }



    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}