package com.kiendst.hci.fragments;


import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.kiendst.hci.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SellerChatttingFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    TextView txtDate1;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public SellerChatttingFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    AlertDialog alertDialog = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_seller_chattting, container, false);

//        showRatingFragment(button1,view);
//
//        txtDate1 = view.findViewById(R.id.txtDate1);
//        final DatePickerDialog datePickerDialog  = new DatePickerDialog(
//                getContext(), HistoryFragment.this,2019,5,11);
//        ImageView imgCalendar= view.findViewById(R.id.imgCalendar);
//        imgCalendar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                datePickerDialog.show();
//            }
//        });
        return view;

    }

    private void showRatingFragment(Button button, final View view) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                final AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
//                final View loginFormView = getLayoutInflater().inflate(R.layout.activity_rating, null);
//                // Set above view in alert dialog.
//                builder.setView(loginFormView);
////                Button registerButton = loginFormView.findViewById(R.id.btnSubmitRate);
//                registerButton.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        try {
//                            // Close Alert Dialog.
//                            alertDialog.cancel();
//                        }catch(Exception ex)
//                        {
//                            ex.printStackTrace();
//                        }
//                    }
//                });
//                builder.setCancelable(true);
//                alertDialog = builder.create();
//                alertDialog.show();
            }
        });
    }
}

