
/***************************************************************************
 *   Copyright 2006-2008 by Christian Ihle                                 *
 *   kontakt@usikkert.net                                                  *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU General Public License     *
 *   along with this program; if not, write to the                         *
 *   Free Software Foundation, Inc.,                                       *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             *
 ***************************************************************************/

package net.usikkert.kouchat.misc;

public class TopicDTO
{
	private String topic, nick;
	private long time;

	public TopicDTO()
	{
		resetTopic();
	}

	public TopicDTO( final String topic, final String nick, final long time )
	{
		this.topic = topic;
		this.nick = nick;
		this.time = time;
	}

	public void changeTopic( final String topic, final String nick, final long time )
	{
		this.topic = topic;
		this.nick = nick;
		this.time = time;
	}

	public void resetTopic()
	{
		topic = "";
		nick = "";
		time = 0;
	}

	public String getNick()
	{
		return nick;
	}

	public void setNick( final String nick )
	{
		this.nick = nick;
	}

	public long getTime()
	{
		return time;
	}

	public void setTime( final long time )
	{
		this.time = time;
	}

	public String getTopic()
	{
		return topic;
	}

	public void setTopic( final String topic )
	{
		this.topic = topic;
	}

	@Override
	public String toString()
	{
		return "(" + nick + ") " + topic;
	}
}
