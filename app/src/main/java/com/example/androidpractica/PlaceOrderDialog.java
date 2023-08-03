package com.example.androidpractica;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.DialogFragment;

public class PlaceOrderDialog extends DialogFragment {
    Spinner spinnerTickets;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.place_order,null);

       spinnerTickets=(Spinner)view.findViewById(R.id.spinner_ticket);
         ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(getContext(), R.array.ticketCategories, android.R.layout.simple_spinner_dropdown_item);
            spinnerTickets.setPrompt("Choose ticket category");
            spinnerTickets.setAdapter(spinnerAdapter);

        builder.setView(view)
                .setTitle("Place order")
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                })
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
        return builder.create();

    }

}
