package teamdapsr.newsstand;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rajanmaurya on 17/8/15.
 */
public class ViewpagerFragment extends Fragment {
        private TextView textView;

        public static ViewpagerFragment getInstance(int position) {
            ViewpagerFragment myFragment = new ViewpagerFragment();
            Bundle args = new Bundle();
            args.putInt("position", position);
            myFragment.setArguments(args);
            return myFragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View layout = inflater.inflate(R.layout.fragment, container, false);


            return layout;

        }


    }