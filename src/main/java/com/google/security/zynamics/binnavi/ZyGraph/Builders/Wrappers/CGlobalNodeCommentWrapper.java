// Copyright 2011-2016 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.security.zynamics.binnavi.ZyGraph.Builders.Wrappers;

import com.google.security.zynamics.binnavi.disassembly.INaviViewNode;

/**
 * Wrapper class to associate the global node comment of a node with a visible node.
 */
public class CGlobalNodeCommentWrapper {
  /**
   * The node whose global comment is wrapped.
   */
  private final INaviViewNode m_node;

  /**
   * Creates a new wrapper object.
   *
   * @param node The node whose global comment is wrapped.
   */
  public CGlobalNodeCommentWrapper(final INaviViewNode node) {
    m_node = node;
  }

  /**
   * Returns the wrapped node.
   *
   * @return The wrapped node.
   */
  public INaviViewNode getNode() {
    return m_node;
  }
}
