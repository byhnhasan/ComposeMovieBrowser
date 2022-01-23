package com.hsnbyhn.composemoviebrowser.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import com.google.accompanist.pager.pagerTabIndicatorOffset
import com.google.accompanist.pager.rememberPagerState
import kotlinx.coroutines.launch

/**
 * Created by hasanbayhan on 22.01.2022
 **/

@ExperimentalPagerApi
@Composable
fun HomeScreen() {

    val tabItems = listOf(
        TabItem.Top250Movies,
        TabItem.MostPopularMovies,
        TabItem.ComingSoonMovies
    )

    val pagerState = rememberPagerState()


    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)) {
        Tabs(pagerState, tabItems)
        TabPage(pagerState = pagerState, tabItems = tabItems)
    }
}

@ExperimentalPagerApi
@Composable
fun TabPage(pagerState: PagerState, tabItems: List<TabItem>) {
    HorizontalPager(count = tabItems.size, state = pagerState) { page ->
        tabItems[page].screen()
    }
}

@ExperimentalPagerApi
@Composable
fun Tabs(pagerState: PagerState, tabItems: List<TabItem>) {

    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    TabRow(
        selectedTabIndex = pagerState.currentPage,
        backgroundColor = Color.Transparent,
        contentColor = Color.White,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions)
            )

        }
    ) {
        tabItems.forEachIndexed { index, tabItem ->
            Tab(
                selected = pagerState.currentPage == index,
                onClick = { scope.launch {
                    pagerState.animateScrollToPage(index)
                }  },
                text = {
                    Text(context.getString(tabItem.title))
                }
            )
        }
    }
}