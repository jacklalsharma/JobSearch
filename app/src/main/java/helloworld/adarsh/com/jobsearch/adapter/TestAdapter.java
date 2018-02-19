package helloworld.adarsh.com.jobsearch.adapter;

import android.app.Activity;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import helloworld.adarsh.com.jobsearch.R;
import helloworld.adarsh.com.jobsearch.retrofitResponse.PsychoTestResponse;

/**
 * Created by Adarsh on 2/7/2018.
 */
public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestViewHolder> {

    private Activity activity;
    private ArrayList<PsychoTestResponse> testArrayList;


    public TestAdapter(Activity activity, ArrayList<PsychoTestResponse> testArrayList) {
        this.activity = activity;
        this.testArrayList = testArrayList;
    }

    @Override
    public TestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.list_item_test, parent, false);

        return new TestViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final TestViewHolder holder, final int position) {
        PsychoTestResponse test = testArrayList.get(position);
        holder.number.setText("" + (position + 1));
        holder.desc.setText(test.getQuestion());

        holder.a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(testArrayList.get(position).isAnswered()){
                    return;
                }

                testArrayList.get(position).setAnswered(true);

                if(isPreviousQuestionAnswered(position)){
                    holder.main.setEnabled(false);
                    return;
                }
                updateNextQuestion(position);
                stronglyAgree(holder);
                testArrayList.get(position).setAnswer("stronglyAgree");
            }
        });

        holder.b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(testArrayList.get(position).isAnswered()){
                    return;
                }

                testArrayList.get(position).setAnswered(true);

                if(isPreviousQuestionAnswered(position)){
                    holder.main.setEnabled(false);
                    return;
                }
                updateNextQuestion(position);
                mostlyAgree(holder);
                testArrayList.get(position).setAnswer("mostlyAgree");

            }
        });

        holder.c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(testArrayList.get(position).isAnswered()){
                    return;
                }

                testArrayList.get(position).setAnswered(true);

                if(isPreviousQuestionAnswered(position)){
                    holder.main.setEnabled(false);

                    return;
                }
                updateNextQuestion(position);
                slightlyAgree(holder);
                testArrayList.get(position).setAnswer("slightlyAgree");

            }
        });

        holder.d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(testArrayList.get(position).isAnswered()){
                    return;
                }

                testArrayList.get(position).setAnswered(true);

                if(isPreviousQuestionAnswered(position)){
                    holder.main.setEnabled(false);
                    return;
                }
                updateNextQuestion(position);
                donotAgree(holder);
                testArrayList.get(position).setAnswer("donotAgree");

            }
        });

        if(testArrayList.get(position).getAnswer().equals("donotAgree")){
           donotAgree(holder);
        }else if(testArrayList.get(position).getAnswer().equals("slightlyAgree")){
            slightlyAgree(holder);
        }else if(testArrayList.get(position).getAnswer().equals("mostlyAgree")){
            mostlyAgree(holder);
        }else if(testArrayList.get(position).getAnswer().equals("stronglyAgree")){
            stronglyAgree(holder);
        }else{
            defaultText(holder);
        }

        if(position == 0 || testArrayList.get(position).isSelectable()){
            holder.main.setBackgroundColor(Color.TRANSPARENT);
        }
    }

    /**
     *
     * @param position
     */
    private void updateNextQuestion(int position){
        int pos = (position + 1) % testArrayList.size();
        if(pos == 0){
            return;
        }
        testArrayList.get(pos).setSelectable(true);
        notifyItemChanged(pos);
    }

    private boolean isPreviousQuestionAnswered(int position){
        if(position == 0){
            return false;
        }

        return testArrayList.get(position -1).getAnswer().equals("");
    }

    /**
     *
     * @param holder
     */
    private void donotAgree(TestViewHolder holder){
        holder.a.setBackgroundTintList(ContextCompat.getColorStateList(activity, android.R.color.darker_gray));
        holder.b.setBackgroundTintList(ContextCompat.getColorStateList(activity, android.R.color.darker_gray));
        holder.c.setBackgroundTintList(ContextCompat.getColorStateList(activity, android.R.color.darker_gray));
        holder.d.setBackgroundTintList(ContextCompat.getColorStateList(activity, R.color.colorPrimary));
        holder.main.setBackgroundColor(Color.TRANSPARENT);
    }

    private void slightlyAgree(TestViewHolder holder){
        holder.main.setBackgroundColor(Color.TRANSPARENT);
        holder.a.setBackgroundTintList(ContextCompat.getColorStateList(activity, android.R.color.darker_gray));
        holder.b.setBackgroundTintList(ContextCompat.getColorStateList(activity, android.R.color.darker_gray));
        holder.c.setBackgroundTintList(ContextCompat.getColorStateList(activity, R.color.colorPrimary));
        holder.d.setBackgroundTintList(ContextCompat.getColorStateList(activity, android.R.color.darker_gray));
    }

    private void mostlyAgree(TestViewHolder holder){
        holder.main.setBackgroundColor(Color.TRANSPARENT);
        holder.a.setBackgroundTintList(ContextCompat.getColorStateList(activity, android.R.color.darker_gray));
        holder.b.setBackgroundTintList(ContextCompat.getColorStateList(activity, R.color.colorPrimary));
        holder.c.setBackgroundTintList(ContextCompat.getColorStateList(activity, android.R.color.darker_gray));
        holder.d.setBackgroundTintList(ContextCompat.getColorStateList(activity, android.R.color.darker_gray));
    }

    private void stronglyAgree(TestViewHolder holder){
        holder.main.setBackgroundColor(Color.TRANSPARENT);
        holder.a.setBackgroundTintList(ContextCompat.getColorStateList(activity, R.color.colorPrimary));
        holder.b.setBackgroundTintList(ContextCompat.getColorStateList(activity, android.R.color.darker_gray));
        holder.c.setBackgroundTintList(ContextCompat.getColorStateList(activity, android.R.color.darker_gray));
        holder.d.setBackgroundTintList(ContextCompat.getColorStateList(activity, android.R.color.darker_gray));
    }

    private void defaultText(TestViewHolder holder){
        holder.a.setBackgroundTintList(ContextCompat.getColorStateList(activity, R.color.text));
        holder.b.setBackgroundTintList(ContextCompat.getColorStateList(activity, R.color.text));
        holder.c.setBackgroundTintList(ContextCompat.getColorStateList(activity, R.color.text));
        holder.d.setBackgroundTintList(ContextCompat.getColorStateList(activity, R.color.text));
        holder.main.setBackgroundColor(activity.getResources().getColor(R.color.trans_color));
    }



    @Override
    public int getItemCount() {
        return testArrayList.size();
    }



    public class TestViewHolder extends RecyclerView.ViewHolder {
        TextView desc;
        TextView number;
        Button a, b, c, d;
        ImageView main;

        public TestViewHolder(View view) {
            super(view);
            desc = (TextView) view.findViewById(R.id.textView5);
            number = (TextView) view.findViewById(R.id.textView);
            a = (Button) view.findViewById(R.id.button);
            b = (Button) view.findViewById(R.id.button1);
            c = (Button) view.findViewById(R.id.button2);
            d = (Button) view.findViewById(R.id.button3);
            main = (ImageView) view.findViewById(R.id.blurr);
        }
    }
}
