package com.ghstudios.android.features.monsters.list;

import com.ghstudios.android.data.classes.MonsterClass;
import com.ghstudios.android.mhgendatabase.R;
import com.ghstudios.android.BasePagerActivity;
import com.ghstudios.android.MenuSection;

/**
 * The main activity for the monster list.
 * Contains separate small, large, and deviant tabs
 */
public class MonsterListPagerActivity extends BasePagerActivity {

    @Override
    public void onAddTabs(TabAdder tabs) {
        setTitle(R.string.monsters);
        super.setAsTopLevel();

        tabs.addTab(getString(R.string.monster_tab_large), () ->
                MonsterListFragment.newInstance(MonsterClass.LARGE)
        );

        tabs.addTab(getString(R.string.monster_tab_deviant), () ->
                MonsterListFragment.newInstance(MonsterClass.DEVIANT)
        );

        tabs.addTab(getString(R.string.monster_tab_small), () ->
                MonsterListFragment.newInstance(MonsterClass.SMALL)
        );
    }

    @Override
    protected int getSelectedSection() {
        return MenuSection.MONSTERS;
    }
}
