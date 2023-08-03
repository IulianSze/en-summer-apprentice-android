package com.example.androidpractica;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.android.material.textfield.TextInputEditText;

import java.text.MessageFormat;
import java.time.LocalDate;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {

    EventDto[] eventDto;
    Context context;

    public EventAdapter(EventDto[] eventDto,MainActivity activity) {
        this.eventDto = eventDto;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.events_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final EventDto myEventDtoList = eventDto[position];
        holder.textViewName.setText(myEventDtoList.getEventName());
        holder.textViewDescription.setText(myEventDtoList.getEventDescription());
        holder.eventImage.setImageResource(myEventDtoList.getEventImage());
        holder.textViewEventType.setText(myEventDtoList.getEventType());
        holder.textStartDate.setText(myEventDtoList.getStartDate().toString());
        holder.textEndDate.setText(myEventDtoList.getEndDate().toString());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myEventDtoList.getEventName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return eventDto.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView eventImage;
        TextView textViewName;
        TextView textViewDescription;
        TextView textViewEventType;
        TextView textStartDate;
        TextView textEndDate;
        Button buyTicket;
        Spinner spinnerTickets;

        SearchView searchView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            eventImage = itemView.findViewById(R.id.imageview);
            textViewName = itemView.findViewById(R.id.textName);
            textViewDescription = itemView.findViewById(R.id.textdescription);
            textViewEventType=itemView.findViewById(R.id.eventType);
            textStartDate=itemView.findViewById(R.id.eventStartDate);
            textEndDate=itemView.findViewById(R.id.eventEndDate);

            buyTicket=itemView.findViewById(R.id.placeOrdBt);

            buyTicket.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    openDialog();

                }
            });

        }

        public void openDialog(){
            PlaceOrderDialog placeOrderDialog = new PlaceOrderDialog();
            placeOrderDialog.show(((AppCompatActivity)context).getSupportFragmentManager(),"Order dialog");
        }
    }}
