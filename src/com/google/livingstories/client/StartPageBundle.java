/**
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS-IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.livingstories.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Bundle consisting of all live living stories and the last 3 top-level items from each.
 */
public class StartPageBundle implements Serializable {
  
  private List<LivingStory> stories;
  private Map<Long, List<BaseAtom>> storyIdToUpdateMap;
  
  public StartPageBundle() {}
  
  public StartPageBundle(List<LivingStory> stories, Map<Long, List<BaseAtom>> storyIdToUpdateMap) {
    this.stories = new ArrayList<LivingStory>(stories);
    this.storyIdToUpdateMap = new HashMap<Long, List<BaseAtom>>(storyIdToUpdateMap);
  }
  
  public List<LivingStory> getStories() {
    return stories;
  }

  public Map<Long, List<BaseAtom>> getStoryIdToUpdateMap() {
    return storyIdToUpdateMap;
  }

}