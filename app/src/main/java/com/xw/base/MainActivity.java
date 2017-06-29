package com.xw.base;

public class MainActivity extends AppActivity {

    @Override
    protected BaseFragment getFirstFragment() {
        return MainFragment.newInstance();
    }
}
