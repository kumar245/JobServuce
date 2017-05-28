package com.kumar.user.jobservuce;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int Jobid=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JobInfo.Builder builder= new JobInfo.Builder(Jobid,new ComponentName(this,MyJobService.class));
        builder.setMinimumLatency(1000);
        builder.setOverrideDeadline(2000);
        builder.setPeriodic(2000);
        builder.setPersisted(true);
        builder.setRequiresDeviceIdle(true);
        builder.setRequiresCharging(true);
        JobScheduler jobScheduler= (JobScheduler) getSystemService(Context.JOB_SCHEDULER_SERVICE);
        jobScheduler.schedule(builder.build());
    }
}
