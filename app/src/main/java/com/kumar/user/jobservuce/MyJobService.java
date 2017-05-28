package com.kumar.user.jobservuce;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

/**
 * Created by User on 5/28/2017.
 */

public class MyJobService extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {
        Log.i("Job","Job is started successfully");
        jobFinished(params,true);
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        Log.i("Job","Job is stop successfully");
        return false;
    }
}
