package redis.clients.jedis;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import redis.clients.jedis.BinaryClient.LIST_POSITION;

public class JedisCluster extends BinaryJedisCluster implements JedisCommands, 
        JedisClusterScriptingCommands {


    public JedisCluster(Set<HostAndPort> nodes, int timeout) {
	super(nodes, timeout, DEFAULT_MAX_REDIRECTIONS);
    }

    public JedisCluster(Set<HostAndPort> nodes) {
	super(nodes, DEFAULT_TIMEOUT);
    }

    public JedisCluster(Set<HostAndPort> jedisClusterNode, int timeout,
	    int maxRedirections) {
	super(jedisClusterNode, timeout, maxRedirections);
    }

    @Override
    public String set(final String key, final String value) {
	return new JedisClusterCommand<String>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public String execute(Jedis connection) {
		return connection.set(key, value);
	    }
	}.run(key);
    }

    @Override
    public String get(final String key) {
	return new JedisClusterCommand<String>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public String execute(Jedis connection) {
		return connection.get(key);
	    }
	}.run(key);
    }

    @Override
    public Boolean exists(final String key) {
	return new JedisClusterCommand<Boolean>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Boolean execute(Jedis connection) {
		return connection.exists(key);
	    }
	}.run(key);
    }

    @Override
    public Long persist(final String key) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.persist(key);
	    }
	}.run(key);
    }

    @Override
    public String type(final String key) {
	return new JedisClusterCommand<String>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public String execute(Jedis connection) {
		return connection.type(key);
	    }
	}.run(key);
    }

    @Override
    public Long expire(final String key, final int seconds) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.expire(key, seconds);
	    }
	}.run(key);
    }

    @Override
    public Long expireAt(final String key, final long unixTime) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection
			.expireAt(key, unixTime);
	    }
	}.run(key);
    }

    @Override
    public Long ttl(final String key) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.ttl(key);
	    }
	}.run(key);
    }

    @Override
    public Boolean setbit(final String key, final long offset,
	    final boolean value) {
	return new JedisClusterCommand<Boolean>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Boolean execute(Jedis connection) {
		return connection.setbit(key, offset,
			value);
	    }
	}.run(key);
    }

    @Override
    public Boolean setbit(final String key, final long offset,
	    final String value) {
	return new JedisClusterCommand<Boolean>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Boolean execute(Jedis connection) {
		return connection.setbit(key, offset,
			value);
	    }
	}.run(key);
    }

    @Override
    public Boolean getbit(final String key, final long offset) {
	return new JedisClusterCommand<Boolean>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Boolean execute(Jedis connection) {
		return connection.getbit(key, offset);
	    }
	}.run(key);
    }

    @Override
    public Long setrange(final String key, final long offset, final String value) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.setrange(key, offset,
			value);
	    }
	}.run(key);
    }

    @Override
    public String getrange(final String key, final long startOffset,
	    final long endOffset) {
	return new JedisClusterCommand<String>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public String execute(Jedis connection) {
		return connection.getrange(key,
			startOffset, endOffset);
	    }
	}.run(key);
    }

    @Override
    public String getSet(final String key, final String value) {
	return new JedisClusterCommand<String>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public String execute(Jedis connection) {
		return connection.getSet(key, value);
	    }
	}.run(key);
    }

    @Override
    public Long setnx(final String key, final String value) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.setnx(key, value);
	    }
	}.run(key);
    }

    @Override
    public String setex(final String key, final int seconds, final String value) {
	return new JedisClusterCommand<String>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public String execute(Jedis connection) {
		return connection.setex(key, seconds,
			value);
	    }
	}.run(key);
    }

    @Override
    public Long decrBy(final String key, final long integer) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.decrBy(key, integer);
	    }
	}.run(key);
    }

    @Override
    public Long decr(final String key) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.decr(key);
	    }
	}.run(key);
    }

    @Override
    public Long incrBy(final String key, final long integer) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.incrBy(key, integer);
	    }
	}.run(key);
    }

    @Override
    public Long incr(final String key) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.incr(key);
	    }
	}.run(key);
    }

    @Override
    public Long append(final String key, final String value) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.append(key, value);
	    }
	}.run(key);
    }

    @Override
    public String substr(final String key, final int start, final int end) {
	return new JedisClusterCommand<String>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public String execute(Jedis connection) {
		return connection
			.substr(key, start, end);
	    }
	}.run(key);
    }

    @Override
    public Long hset(final String key, final String field, final String value) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection
			.hset(key, field, value);
	    }
	}.run(key);
    }

    @Override
    public String hget(final String key, final String field) {
	return new JedisClusterCommand<String>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public String execute(Jedis connection) {
		return connection.hget(key, field);
	    }
	}.run(key);
    }

    @Override
    public Long hsetnx(final String key, final String field, final String value) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.hsetnx(key, field,
			value);
	    }
	}.run(key);
    }

    @Override
    public String hmset(final String key, final Map<String, String> hash) {
	return new JedisClusterCommand<String>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public String execute(Jedis connection) {
		return connection.hmset(key, hash);
	    }
	}.run(key);
    }

    @Override
    public List<String> hmget(final String key, final String... fields) {
	return new JedisClusterCommand<List<String>>(connectionHandler,
		timeout, maxRedirections) {
	    @Override
	    public List<String> execute(Jedis connection) {
		return connection.hmget(key, fields);
	    }
	}.run(key);
    }

    @Override
    public Long hincrBy(final String key, final String field, final long value) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.hincrBy(key, field,
			value);
	    }
	}.run(key);
    }

    @Override
    public Boolean hexists(final String key, final String field) {
	return new JedisClusterCommand<Boolean>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Boolean execute(Jedis connection) {
		return connection.hexists(key, field);
	    }
	}.run(key);
    }

    @Override
    public Long hdel(final String key, final String... field) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.hdel(key, field);
	    }
	}.run(key);
    }

    @Override
    public Long hlen(final String key) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.hlen(key);
	    }
	}.run(key);
    }

    @Override
    public Set<String> hkeys(final String key) {
	return new JedisClusterCommand<Set<String>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<String> execute(Jedis connection) {
		return connection.hkeys(key);
	    }
	}.run(key);
    }

    @Override
    public List<String> hvals(final String key) {
	return new JedisClusterCommand<List<String>>(connectionHandler,
		timeout, maxRedirections) {
	    @Override
	    public List<String> execute(Jedis connection) {
		return connection.hvals(key);
	    }
	}.run(key);
    }

    @Override
    public Map<String, String> hgetAll(final String key) {
	return new JedisClusterCommand<Map<String, String>>(connectionHandler,
		timeout, maxRedirections) {
	    @Override
	    public Map<String, String> execute(Jedis connection) {
		return connection.hgetAll(key);
	    }
	}.run(key);
    }

    @Override
    public Long rpush(final String key, final String... string) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.rpush(key, string);
	    }
	}.run(key);
    }

    @Override
    public Long lpush(final String key, final String... string) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.lpush(key, string);
	    }
	}.run(key);
    }

    @Override
    public Long llen(final String key) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.llen(key);
	    }
	}.run(key);
    }

    @Override
    public List<String> lrange(final String key, final long start,
	    final long end) {
	return new JedisClusterCommand<List<String>>(connectionHandler,
		timeout, maxRedirections) {
	    @Override
	    public List<String> execute(Jedis connection) {
		return connection
			.lrange(key, start, end);
	    }
	}.run(key);
    }

    @Override
    public String ltrim(final String key, final long start, final long end) {
	return new JedisClusterCommand<String>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public String execute(Jedis connection) {
		return connection.ltrim(key, start, end);
	    }
	}.run(key);
    }

    @Override
    public String lindex(final String key, final long index) {
	return new JedisClusterCommand<String>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public String execute(Jedis connection) {
		return connection.lindex(key, index);
	    }
	}.run(key);
    }

    @Override
    public String lset(final String key, final long index, final String value) {
	return new JedisClusterCommand<String>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public String execute(Jedis connection) {
		return connection
			.lset(key, index, value);
	    }
	}.run(key);
    }

    @Override
    public Long lrem(final String key, final long count, final String value) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection
			.lrem(key, count, value);
	    }
	}.run(key);
    }

    @Override
    public String lpop(final String key) {
	return new JedisClusterCommand<String>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public String execute(Jedis connection) {
		return connection.lpop(key);
	    }
	}.run(key);
    }

    @Override
    public String rpop(final String key) {
	return new JedisClusterCommand<String>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public String execute(Jedis connection) {
		return connection.rpop(key);
	    }
	}.run(key);
    }

    @Override
    public Long sadd(final String key, final String... member) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.sadd(key, member);
	    }
	}.run(key);
    }

    @Override
    public Set<String> smembers(final String key) {
	return new JedisClusterCommand<Set<String>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<String> execute(Jedis connection) {
		return connection.smembers(key);
	    }
	}.run(key);
    }

    @Override
    public Long srem(final String key, final String... member) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.srem(key, member);
	    }
	}.run(key);
    }

    @Override
    public String spop(final String key) {
	return new JedisClusterCommand<String>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public String execute(Jedis connection) {
		return connection.spop(key);
	    }
	}.run(key);
    }

    @Override
    public Long scard(final String key) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.scard(key);
	    }
	}.run(key);
    }

    @Override
    public Boolean sismember(final String key, final String member) {
	return new JedisClusterCommand<Boolean>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Boolean execute(Jedis connection) {
		return connection.sismember(key, member);
	    }
	}.run(key);
    }

    @Override
    public String srandmember(final String key) {
	return new JedisClusterCommand<String>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public String execute(Jedis connection) {
		return connection.srandmember(key);
	    }
	}.run(key);
    }

    @Override
    public Long strlen(final String key) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.strlen(key);
	    }
	}.run(key);
    }

    @Override
    public Long zadd(final String key, final double score, final String member) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.zadd(key, score,
			member);
	    }
	}.run(key);
    }

    @Override
    public Long zadd(final String key, final Map<String, Double> scoreMembers) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection
			.zadd(key, scoreMembers);
	    }
	}.run(key);
    }

    @Override
    public Set<String> zrange(final String key, final long start, final long end) {
	return new JedisClusterCommand<Set<String>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<String> execute(Jedis connection) {
		return connection
			.zrange(key, start, end);
	    }
	}.run(key);
    }

    @Override
    public Long zrem(final String key, final String... member) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.zrem(key, member);
	    }
	}.run(key);
    }

    @Override
    public Double zincrby(final String key, final double score,
	    final String member) {
	return new JedisClusterCommand<Double>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Double execute(Jedis connection) {
		return connection.zincrby(key, score,
			member);
	    }
	}.run(key);
    }

    @Override
    public Long zrank(final String key, final String member) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.zrank(key, member);
	    }
	}.run(key);
    }

    @Override
    public Long zrevrank(final String key, final String member) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.zrevrank(key, member);
	    }
	}.run(key);
    }

    @Override
    public Set<String> zrevrange(final String key, final long start,
	    final long end) {
	return new JedisClusterCommand<Set<String>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<String> execute(Jedis connection) {
		return connection.zrevrange(key, start,
			end);
	    }
	}.run(key);
    }

    @Override
    public Set<Tuple> zrangeWithScores(final String key, final long start,
	    final long end) {
	return new JedisClusterCommand<Set<Tuple>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<Tuple> execute(Jedis connection) {
		return connection.zrangeWithScores(key,
			start, end);
	    }
	}.run(key);
    }

    @Override
    public Set<Tuple> zrevrangeWithScores(final String key, final long start,
	    final long end) {
	return new JedisClusterCommand<Set<Tuple>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<Tuple> execute(Jedis connection) {
		return connection.zrevrangeWithScores(
			key, start, end);
	    }
	}.run(key);
    }

    @Override
    public Long zcard(final String key) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.zcard(key);
	    }
	}.run(key);
    }

    @Override
    public Double zscore(final String key, final String member) {
	return new JedisClusterCommand<Double>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Double execute(Jedis connection) {
		return connection.zscore(key, member);
	    }
	}.run(key);
    }

    @Override
    public List<String> sort(final String key) {
	return new JedisClusterCommand<List<String>>(connectionHandler,
		timeout, maxRedirections) {
	    @Override
	    public List<String> execute(Jedis connection) {
		return connection.sort(key);
	    }
	}.run(key);
    }

    @Override
    public List<String> sort(final String key,
	    final SortingParams sortingParameters) {
	return new JedisClusterCommand<List<String>>(connectionHandler,
		timeout, maxRedirections) {
	    @Override
	    public List<String> execute(Jedis connection) {
		return connection.sort(key,
			sortingParameters);
	    }
	}.run(key);
    }

    @Override
    public Long zcount(final String key, final double min, final double max) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.zcount(key, min, max);
	    }
	}.run(key);
    }

    @Override
    public Long zcount(final String key, final String min, final String max) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.zcount(key, min, max);
	    }
	}.run(key);
    }

    @Override
    public Set<String> zrangeByScore(final String key, final double min,
	    final double max) {
	return new JedisClusterCommand<Set<String>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<String> execute(Jedis connection) {
		return connection.zrangeByScore(key,
			min, max);
	    }
	}.run(key);
    }

    @Override
    public Set<String> zrangeByScore(final String key, final String min,
	    final String max) {
	return new JedisClusterCommand<Set<String>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<String> execute(Jedis connection) {
		return connection.zrangeByScore(key,
			min, max);
	    }
	}.run(key);
    }

    @Override
    public Set<String> zrevrangeByScore(final String key, final double max,
	    final double min) {
	return new JedisClusterCommand<Set<String>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<String> execute(Jedis connection) {
		return connection.zrevrangeByScore(key,
			min, max);
	    }
	}.run(key);
    }

    @Override
    public Set<String> zrangeByScore(final String key, final double min,
	    final double max, final int offset, final int count) {
	return new JedisClusterCommand<Set<String>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<String> execute(Jedis connection) {
		return connection.zrangeByScore(key,
			min, max, offset, count);
	    }
	}.run(key);
    }

    @Override
    public Set<String> zrevrangeByScore(final String key, final String max,
	    final String min) {
	return new JedisClusterCommand<Set<String>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<String> execute(Jedis connection) {
		return connection.zrevrangeByScore(key,
			min, max);
	    }
	}.run(key);
    }

    @Override
    public Set<String> zrangeByScore(final String key, final String min,
	    final String max, final int offset, final int count) {
	return new JedisClusterCommand<Set<String>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<String> execute(Jedis connection) {
		return connection.zrangeByScore(key,
			min, max, offset, count);
	    }
	}.run(key);
    }

    @Override
    public Set<String> zrevrangeByScore(final String key, final double max,
	    final double min, final int offset, final int count) {
	return new JedisClusterCommand<Set<String>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<String> execute(Jedis connection) {
		return connection.zrevrangeByScore(key,
			min, max, offset, count);
	    }
	}.run(key);
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(final String key,
	    final double min, final double max) {
	return new JedisClusterCommand<Set<Tuple>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<Tuple> execute(Jedis connection) {
		return connection
			.zrangeByScoreWithScores(key, min, max);
	    }
	}.run(key);
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(final String key,
	    final double max, final double min) {
	return new JedisClusterCommand<Set<Tuple>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<Tuple> execute(Jedis connection) {
		return connection
			.zrevrangeByScoreWithScores(key, min, max);
	    }
	}.run(key);
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(final String key,
	    final double min, final double max, final int offset,
	    final int count) {
	return new JedisClusterCommand<Set<Tuple>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<Tuple> execute(Jedis connection) {
		return connection
			.zrangeByScoreWithScores(key, min, max, offset, count);
	    }
	}.run(key);
    }

    @Override
    public Set<String> zrevrangeByScore(final String key, final String max,
	    final String min, final int offset, final int count) {
	return new JedisClusterCommand<Set<String>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<String> execute(Jedis connection) {
		return connection.zrevrangeByScore(key,
			min, max, offset, count);
	    }
	}.run(key);
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(final String key,
	    final String min, final String max) {
	return new JedisClusterCommand<Set<Tuple>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<Tuple> execute(Jedis connection) {
		return connection
			.zrangeByScoreWithScores(key, min, max);
	    }
	}.run(key);
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(final String key,
	    final String max, final String min) {
	return new JedisClusterCommand<Set<Tuple>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<Tuple> execute(Jedis connection) {
		return connection
			.zrevrangeByScoreWithScores(key, min, max);
	    }
	}.run(key);
    }

    @Override
    public Set<Tuple> zrangeByScoreWithScores(final String key,
	    final String min, final String max, final int offset,
	    final int count) {
	return new JedisClusterCommand<Set<Tuple>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<Tuple> execute(Jedis connection) {
		return connection
			.zrangeByScoreWithScores(key, min, max, offset, count);
	    }
	}.run(key);
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(final String key,
	    final double max, final double min, final int offset,
	    final int count) {
	return new JedisClusterCommand<Set<Tuple>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<Tuple> execute(Jedis connection) {
		return connection
			.zrevrangeByScoreWithScores(key, max, min, offset,
				count);
	    }
	}.run(key);
    }

    @Override
    public Set<Tuple> zrevrangeByScoreWithScores(final String key,
	    final String max, final String min, final int offset,
	    final int count) {
	return new JedisClusterCommand<Set<Tuple>>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Set<Tuple> execute(Jedis connection) {
		return connection
			.zrevrangeByScoreWithScores(key, max, min, offset,
				count);
	    }
	}.run(key);
    }

    @Override
    public Long zremrangeByRank(final String key, final long start,
	    final long end) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.zremrangeByRank(key,
			start, end);
	    }
	}.run(key);
    }

    @Override
    public Long zremrangeByScore(final String key, final double start,
	    final double end) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.zremrangeByScore(key,
			start, end);
	    }
	}.run(key);
    }

    @Override
    public Long zremrangeByScore(final String key, final String start,
	    final String end) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.zremrangeByScore(key,
			start, end);
	    }
	}.run(key);
    }

    @Override
    public Long linsert(final String key, final LIST_POSITION where,
	    final String pivot, final String value) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.linsert(key, where,
			pivot, value);
	    }
	}.run(key);
    }

    @Override
    public Long lpushx(final String key, final String... string) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.lpushx(key, string);
	    }
	}.run(key);
    }

    @Override
    public Long rpushx(final String key, final String... string) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.rpushx(key, string);
	    }
	}.run(key);
    }

    @Override
    public List<String> blpop(final String arg) {
	return new JedisClusterCommand<List<String>>(connectionHandler,
		timeout, maxRedirections) {
	    @Override
	    public List<String> execute(Jedis connection) {
		return connection.blpop(arg);
	    }
	}.run(null);
    }

    @Override
    public List<String> brpop(final String arg) {
	return new JedisClusterCommand<List<String>>(connectionHandler,
		timeout, maxRedirections) {
	    @Override
	    public List<String> execute(Jedis connection) {
		return connection.brpop(arg);
	    }
	}.run(null);
    }

    @Override
    public Long del(final String key) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.del(key);
	    }
	}.run(key);
    }

    @Override
    public String echo(final String string) {
	return new JedisClusterCommand<String>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public String execute(Jedis connection) {
		return connection.echo(string);
	    }
	}.run(null);
    }

    @Override
    public Long move(final String key, final int dbIndex) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.move(key, dbIndex);
	    }
	}.run(key);
    }

    @Override
    public Long bitcount(final String key) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.bitcount(key);
	    }
	}.run(key);
    }

    @Override
    public Long bitcount(final String key, final long start, final long end) {
	return new JedisClusterCommand<Long>(connectionHandler, timeout,
		maxRedirections) {
	    @Override
	    public Long execute(Jedis connection) {
		return connection.bitcount(key, start,
			end);
	    }
	}.run(key);
    }

    @Deprecated
    /**
     * This method is deprecated due to bug (scan cursor should be unsigned long)
     * And will be removed on next major release
     * @see https://github.com/xetorthio/jedis/issues/531 
     */
    @Override
    public ScanResult<Entry<String, String>> hscan(final String key,
	    final int cursor) {
	return new JedisClusterCommand<ScanResult<Entry<String, String>>>(
		connectionHandler, timeout, maxRedirections) {
	    @Override
	    public ScanResult<Entry<String, String>> execute(Jedis connection) {
		return connection.hscan(key, cursor);
	    }
	}.run(null);
    }

    @Deprecated
    /**
     * This method is deprecated due to bug (scan cursor should be unsigned long)
     * And will be removed on next major release
     * @see https://github.com/xetorthio/jedis/issues/531 
     */
    @Override
    public ScanResult<String> sscan(final String key, final int cursor) {
	return new JedisClusterCommand<ScanResult<String>>(connectionHandler,
		timeout, maxRedirections) {
	    @Override
	    public ScanResult<String> execute(Jedis connection) {
		return connection.sscan(key, cursor);
	    }
	}.run(null);
    }

    @Deprecated
    /**
     * This method is deprecated due to bug (scan cursor should be unsigned long)
     * And will be removed on next major release
     * @see https://github.com/xetorthio/jedis/issues/531 
     */
    @Override
    public ScanResult<Tuple> zscan(final String key, final int cursor) {
	return new JedisClusterCommand<ScanResult<Tuple>>(connectionHandler,
		timeout, maxRedirections) {
	    @Override
	    public ScanResult<Tuple> execute(Jedis connection) {
		return connection.zscan(key, cursor);
	    }
	}.run(null);
    }
    
    @Override
    public ScanResult<Entry<String, String>> hscan(final String key,
	    final String cursor) {
	return new JedisClusterCommand<ScanResult<Entry<String, String>>>(
		connectionHandler, timeout, maxRedirections) {
	    @Override
	    public ScanResult<Entry<String, String>> execute(Jedis connection) {
		return connection.hscan(key, cursor);
	    }
	}.run(null);
    }
    
    @Override
    public ScanResult<String> sscan(final String key, final String cursor) {
	return new JedisClusterCommand<ScanResult<String>>(connectionHandler,
		timeout, maxRedirections) {
	    @Override
	    public ScanResult<String> execute(Jedis connection) {
		return connection.sscan(key, cursor);
	    }
	}.run(null);
    }
    
    @Override
    public ScanResult<Tuple> zscan(final String key, final String cursor) {
	return new JedisClusterCommand<ScanResult<Tuple>>(connectionHandler,
		timeout, maxRedirections) {
	    @Override
	    public ScanResult<Tuple> execute(Jedis connection) {
		return connection.zscan(key, cursor);
	    }
	}.run(null);
    }
    
    @Override
    public Object eval(final String script, final int keyCount, final String... params) {
    return new JedisClusterCommand<Object>(connectionHandler,
        timeout, maxRedirections) {
        @Override
        public Object execute(Jedis connection) {
        return connection.eval(script, keyCount, params);
        }
    }.run(keyCount, params);
    }
    
    @Override
    public Object eval(final String script, final String key) {
    return new JedisClusterCommand<Object>(connectionHandler,
        timeout, maxRedirections) {
        @Override
        public Object execute(Jedis connection) {
        return connection.eval(script);
        }
    }.run(key);
    }
    
    @Override
    public Object eval(final String script, final List<String> keys, final List<String> args) {
    return new JedisClusterCommand<Object>(connectionHandler,
        timeout, maxRedirections) {
        @Override
        public Object execute(Jedis connection) {
        return connection.eval(script, keys, args);
        }
    }.run(keys.size(), keys.toArray(new String[keys.size()]));
    }
    
    @Override
    public Object evalsha(final String sha1, final int keyCount, final String... params) {
    return new JedisClusterCommand<Object>(connectionHandler,
        timeout, maxRedirections) {
        @Override
        public Object execute(Jedis connection) {
        return connection.evalsha(sha1, keyCount, params);
        }
    }.run(keyCount, params);
    }
    
    @Override
    public Object evalsha(final String sha1, final List<String> keys, final List<String> args) {
    return new JedisClusterCommand<Object>(connectionHandler,
        timeout, maxRedirections) {
        @Override
        public Object execute(Jedis connection) {
        return connection.evalsha(sha1, keys, args);
        }
    }.run(keys.size(), keys.toArray(new String[keys.size()]));
    }
    
    @Override
    public Object evalsha(final String script, final String key) {
    return new JedisClusterCommand<Object>(connectionHandler,
        timeout, maxRedirections) {
        @Override
        public Object execute(Jedis connection) {
        return connection.evalsha(script);
        }
    }.run(key);
    }
    
    @Override
    public Boolean scriptExists(final String sha1, final String key) {
    return new JedisClusterCommand<Boolean>(connectionHandler,
        timeout, maxRedirections) {
        @Override
        public Boolean execute(Jedis connection) {
        return connection.scriptExists(sha1);
        }
    }.run(key);
    }
    
    @Override
    public List<Boolean> scriptExists(final String key, final String... sha1) {
    return new JedisClusterCommand<List<Boolean>>(connectionHandler,
        timeout, maxRedirections) {
        @Override
        public List<Boolean> execute(Jedis connection) {
        return connection.scriptExists(sha1);
        }
    }.run(key);
    }
    
    @Override
    public String scriptLoad(final String script, final String key) {
    return new JedisClusterCommand<String>(connectionHandler,
        timeout, maxRedirections) {
        @Override
        public String execute(Jedis connection) {
        return connection.scriptLoad(script);
        }
    }.run(key);
    }
}

    
